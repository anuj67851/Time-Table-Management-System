package timetable.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import timetable.entity.Lectures;
import timetable.entity.Teacher;
import timetable.entity.Tteacher;

import java.util.List;

@Repository
public class teacherDao {
    private SessionFactory sessionFactory;

    public teacherDao() {

    }

    @Autowired
    public teacherDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public Integer getTeacherCount() {
        Session session = sessionFactory.getCurrentSession();

        return ((Long) session.createQuery("select count(*) from Teacher t where t.isTeacher = 1").uniqueResult()).intValue();

    }

    @Transactional
    public List<Teacher> getallTeachers() {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("from Teacher t where t.isTeacher = 1", Teacher.class).getResultList();
    }

    @Transactional
    public List<Teacher> getAllTeacherVariable() {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("from Teacher t where t.isTeacher = 0", Teacher.class).getResultList();
    }

    @Transactional
    public void deleteFaculty(String code) {
        Session session = sessionFactory.getCurrentSession();

        Tteacher tteacher = session.get(Tteacher.class , code);

        if (tteacher != null) {
            session.delete(session.get(Teacher.class, code));
            session.delete(session.get(Tteacher.class, code));
        }

    }

    @Transactional
    public Teacher getTeacher(String code) {
        Session session = sessionFactory.getCurrentSession();

        return session.get(Teacher.class, code);
    }

    @Transactional
    public String updateTeacher(String oldCode, String code, String firstname, String lastname) {
        Session session = sessionFactory.getCurrentSession();

        if (session.get(Teacher.class, code) != null && !oldCode.equals(code)) {
            return "Teacher with that code already exists";
        }

        Teacher teacher = session.get(Teacher.class, oldCode);
        Tteacher tteacher = session.get(Tteacher.class, oldCode);

        session.delete(teacher);

        teacher.setCode(code);
        teacher.setFirstname(firstname);
        teacher.setLastname(lastname);
        session.save(teacher);

        session.createSQLQuery("ALTER TABLE `sgp-timetable`.`lectures` DROP FOREIGN KEY `fk_teacher`").executeUpdate();
        session.createSQLQuery("INSERT into `sgp-timetable`.`tteacher` values (:newcode)").setParameter("newcode" , code).executeUpdate();
        session.createSQLQuery("UPDATE `sgp-timetable`.`lectures` set TeacherCode = :newcode where TeacherCode = :oldcode ").setParameter("newcode" , code).setParameter("oldcode", oldCode).executeUpdate();
        session.createSQLQuery("ALTER TABLE `sgp-timetable`.`lectures` ADD CONSTRAINT `fk_teacher` FOREIGN KEY (`TeacherCode`) REFERENCES `sgp-timetable`.`tteacher` (`Code`) ON DELETE SET NULL ON UPDATE SET NULL").executeUpdate();

        session.delete(tteacher);
        return "Updated Successfully";
    }

    @Transactional
    public String addTeacher(String code, String firstname, String lastname) {
        Session session = sessionFactory.getCurrentSession();
        if (session.get(Teacher.class, code) != null) {
            return "Faculty with same code already exists";
        }


        Teacher teacher = new Teacher();
        teacher.setCode(code);
        teacher.setLastname(lastname);
        teacher.setFirstname(firstname);
        teacher.setIsTeacher(1);
        session.save(teacher);

        Tteacher tteacher = new Tteacher();
        tteacher.setCode(code);
        session.save(tteacher);

        return "Faculty added successfully";
    }

    @Transactional
    public String addFacultyVar(String vname) {
        Session session = sessionFactory.getCurrentSession();
        if (session.get(Teacher.class, vname) != null) {
            return "Variable with same code already exists";
        }


        Teacher teacher = new Teacher();
        teacher.setCode(vname);
        teacher.setIsTeacher(0);
        session.save(teacher);

        Tteacher tteacher = new Tteacher();
        tteacher.setCode(vname);
        session.save(tteacher);

        return "Faculty Variable added successfully";
    }

    @Transactional
    public String updateTeacherVariable(String oldCode, String code, String firstname, String lastname) {
        Session session = sessionFactory.getCurrentSession();

        if (session.get(Teacher.class, code) != null && !oldCode.equals(code)) {
            return "The Code is already in Use";
        }

        Teacher teacher = session.get(Teacher.class, oldCode);
        Tteacher tteacher = session.get(Tteacher.class, oldCode);

        session.delete(teacher);

        if (firstname == null || firstname.equals("")) {

            teacher.setCode(code);
            session.save(teacher);

            session.createSQLQuery("ALTER TABLE `sgp-timetable`.`lectures` DROP FOREIGN KEY `fk_teacher`").executeUpdate();
            session.createSQLQuery("INSERT into `sgp-timetable`.`tteacher` values (:newcode)").setParameter("newcode" , code).executeUpdate();
            session.createSQLQuery("UPDATE `sgp-timetable`.`lectures` set TeacherCode = :newcode where TeacherCode = :oldcode ").setParameter("newcode" , code).setParameter("oldcode", oldCode).executeUpdate();
            session.createSQLQuery("ALTER TABLE `sgp-timetable`.`lectures` ADD CONSTRAINT `fk_teacher` FOREIGN KEY (`TeacherCode`) REFERENCES `sgp-timetable`.`tteacher` (`Code`) ON DELETE SET NULL ON UPDATE SET NULL").executeUpdate();

            session.delete(tteacher);
            return null;
        }

        teacher.setCode(code);
        teacher.setFirstname(firstname);
        teacher.setLastname(lastname);
        teacher.setIsTeacher(1);
        session.save(teacher);

        session.createSQLQuery("ALTER TABLE `sgp-timetable`.`lectures` DROP FOREIGN KEY `fk_teacher`").executeUpdate();
        session.createSQLQuery("INSERT into `sgp-timetable`.`tteacher` values (:newcode)").setParameter("newcode" , code).executeUpdate();
        session.createSQLQuery("UPDATE `sgp-timetable`.`lectures` set TeacherCode = :newcode where TeacherCode = :oldcode ").setParameter("newcode" , code).setParameter("oldcode", oldCode).executeUpdate();
        session.createSQLQuery("ALTER TABLE `sgp-timetable`.`lectures` ADD CONSTRAINT `fk_teacher` FOREIGN KEY (`TeacherCode`) REFERENCES `sgp-timetable`.`tteacher` (`Code`) ON DELETE SET NULL ON UPDATE SET NULL").executeUpdate();

        session.delete(tteacher);
        return null;
    }

    @Transactional
    public void deleteFacultyLectures(String code) {
        Session session = sessionFactory.getCurrentSession();

        List<Lectures> allLecture = session.createQuery("from Lectures l where l.teacher.code = :tcode",Lectures.class).setParameter("tcode",code).getResultList();

        for (Lectures tempLecture : allLecture) {
            session.delete(tempLecture);
        }
    }
}
