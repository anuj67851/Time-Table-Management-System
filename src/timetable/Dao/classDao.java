package timetable.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import timetable.entity.Classroom;
import timetable.entity.Lectures;
import timetable.entity.Tclassroom;

import java.util.List;

@Repository
public class classDao {
    private SessionFactory sessionFactory;

    @Autowired
    public classDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public Integer getClassCount() {
        Session session = sessionFactory.getCurrentSession();

        return ((Long) session.createQuery("select count(*) from Classroom").uniqueResult()).intValue();
    }

    @Transactional
    public List<Classroom> getAllClasses() {
        return sessionFactory.getCurrentSession().createQuery("from Classroom ", Classroom.class).getResultList();
    }

    @Transactional
    public String addClassroom(String code, Integer isVar) {

        Session session = sessionFactory.getCurrentSession();
        if (session.get(Classroom.class, code) != null) {
            return "Classroom already exists";
        }


        Classroom classroom = new Classroom();
        classroom.setClassroom(code);
        classroom.setIsVar(isVar);
        session.save(classroom);

        Tclassroom tclassroom = new Tclassroom();
        tclassroom.setClassroom(code);
        session.save(tclassroom);

        return "Classroom added successfully";
    }

    @Transactional
    public Classroom getClassroom(String code) {
        Session session = sessionFactory.getCurrentSession();

        return session.get(Classroom.class, code);
    }

    @Transactional
    public String updateClassroom(String oldCode, String code, Integer isVar) {

        Session session = sessionFactory.getCurrentSession();

        if (session.get(Classroom.class, code) != null && !oldCode.equals(code)) {
            return "Classroom already exists";
        }

        Classroom classroom = session.get(Classroom.class, oldCode);
        Tclassroom tclassroom = session.get(Tclassroom.class, oldCode);

        session.delete(classroom);

        classroom.setClassroom(code);
        classroom.setIsVar(isVar);
        session.save(classroom);

        session.createSQLQuery("ALTER TABLE `sgp-timetable`.`lectures` DROP FOREIGN KEY `fk_class`").executeUpdate();
        session.createSQLQuery("INSERT into `sgp-timetable`.`tclassroom` values (:newcode)").setParameter("newcode", code).executeUpdate();
        session.createSQLQuery("UPDATE `sgp-timetable`.`lectures` set Classroom = :newcode where Classroom = :oldcode ").setParameter("newcode", code).setParameter("oldcode", oldCode).executeUpdate();
        session.createSQLQuery("ALTER TABLE `sgp-timetable`.`lectures` ADD CONSTRAINT `fk_class` FOREIGN KEY (`Classroom`) REFERENCES `sgp-timetable`.`tclassroom` (`Classroom`) ON DELETE SET NULL ON UPDATE SET NULL").executeUpdate();

        session.delete(tclassroom);
        return "Updated Successfully";
    }

    @Transactional
    public void deleteClassroom(String code) {
        Session session = sessionFactory.getCurrentSession();

        if (session.get(Tclassroom.class, code) != null) {

            session.delete(session.get(Tclassroom.class, code));
            session.delete(session.get(Classroom.class, code));
        }
    }

    @Transactional
    public void deleteLecturesForClass(String code) {
        Session session = sessionFactory.getCurrentSession();

        List<Lectures> allLecture = session.createQuery("from Lectures l where l.classroom.classroom = :ccode", Lectures.class).setParameter("ccode", code).getResultList();

        for (Lectures tempLecture : allLecture) {
            session.delete(tempLecture);
        }
    }
}
