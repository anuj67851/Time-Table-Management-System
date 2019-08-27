package timetable.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import timetable.entity.Lectures;
import timetable.entity.Subject;

import java.util.List;

@Repository
public class subjectDao {
    private SessionFactory sessionFactory;

    @Autowired
    public subjectDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public Integer getSubjectCount() {
        Session session = sessionFactory.getCurrentSession();

        return ((Long) session.createQuery("select count(*) from Subject ").uniqueResult()).intValue();
    }

    @Transactional
    public List<Subject> getAllSubjects() {

        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("From Subject order by academicSemester", Subject.class).getResultList();

    }

    @Transactional
    public String addSubject(String scode, String name, String shortCode, String semester, int elective) {

        Session session = sessionFactory.getCurrentSession();

        if (session.get(Subject.class, scode) != null) {
            return "Subject with that Code already Exists";
        }

        Subject subject = new Subject();
        subject.setScode(scode);
        subject.setName(name);
        subject.setShortcode(shortCode);
        subject.setAcademicSemester(semester);
        subject.setElective(elective);
        session.save(subject);
        return "Subject Added SuccessFully";
    }

    @Transactional
    public Subject getSubject(String scode) {
        Session session = sessionFactory.getCurrentSession();

        return session.get(Subject.class, scode);
    }

    @Transactional
    public String editSubject(String oldCode, String oldShortCode, String scode, String name, String shortCode, String semester, int elective) {
        Session session = sessionFactory.getCurrentSession();

        if (session.get(Subject.class, scode) != null && !oldCode.equals(scode)) {
            return "Subject with that code already Exists";
        }

        Subject subject = session.get(Subject.class, oldCode);
        session.delete(subject);

        subject.setScode(scode);
        subject.setAcademicSemester(semester);
        subject.setShortcode(shortCode);
        subject.setName(name);
        subject.setElective(elective);

        session.save(subject);

        session.createSQLQuery("UPDATE `sgp-timetable`.`lectures` set Subject = replace(Subject , :oldcode,:newcode)").setParameter("oldcode", oldShortCode).setParameter("newcode", shortCode).executeUpdate();

        return null;
    }

    @Transactional
    public void deleteSubject(String code) {
        Session session = sessionFactory.getCurrentSession();

        Subject subject = session.get(Subject.class, code);
        if (subject != null) {
            session.delete(session.get(Subject.class, code));
        }
    }
}
