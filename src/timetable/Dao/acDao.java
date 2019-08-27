package timetable.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import timetable.entity.Academicclasses;
import timetable.entity.Lectures;

import java.util.List;

@Repository
public class acDao {

    private SessionFactory sessionFactory;

    @Autowired
    public acDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public List<Academicclasses> getAllAcNormal() {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("from Academicclasses a where a.isCombinedClass = 0", Academicclasses.class).getResultList();
    }

    @Transactional
    public List<Academicclasses> getAllAcCombined() {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("from Academicclasses a where a.isCombinedClass = 1", Academicclasses.class).getResultList();
    }

    @Transactional
    public Academicclasses getAc(String academicClass) {
        Session session = sessionFactory.getCurrentSession();

        return session.get(Academicclasses.class, academicClass);
    }

    @Transactional
    public void deleteAc(String academicClass) {
        Session session = sessionFactory.getCurrentSession();

        Academicclasses academicclasses = session.get(Academicclasses.class, academicClass);

        if (academicclasses != null) {
            session.delete(academicclasses);
        }

    }

    @Transactional
    public String addAc(String academicClass , Integer combined) {
        Session session = sessionFactory.getCurrentSession();

        if (session.get(Academicclasses.class, academicClass) != null) {
            return "Already Existe";
        }

        Academicclasses academicclasses = new Academicclasses();
        academicclasses.setAcademicClass(academicClass.toUpperCase());
        academicclasses.setIsCombinedClass(combined);
        session.save(academicclasses);
        return "Added SuccessFully";
    }

    @Transactional
    public void deleteLecturesForAc(String code) {
        Session session = sessionFactory.getCurrentSession();

        Academicclasses academicclasses = session.get(Academicclasses.class, code);

        session.delete(academicclasses);

        academicclasses.setLectures(null);

        session.save(academicclasses);
    }

    @Transactional
    public List<Lectures> getAllLecturesForAc(String academicClass) {

        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("from Lectures l where l.academicclasses.academicClass = :param", Lectures.class).setParameter("param", academicClass).getResultList();
    }
}
