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
public class lecturesDao {

    private SessionFactory sessionFactory;

    @Autowired
    public lecturesDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public List<Lectures> getAllLecturesIndex(){
        return sessionFactory.getCurrentSession().createQuery("From Lectures l order by l.id desc " , Lectures.class).setMaxResults(8).getResultList();
    }

    @Transactional
    public void deleteLecture(Integer id) {

        Session session = sessionFactory.getCurrentSession();

        Lectures lecture = session.get(Lectures.class , id);
        if (lecture!=null){
            session.delete(lecture);
        }

    }

    @Transactional
    public void deleteLectureForFaculty(Integer id) {

        Session session = sessionFactory.getCurrentSession();

        Lectures lectures = session.get(Lectures.class , id);
        if (lectures!=null){
            session.delete(lectures);
        }
    }

    @Transactional
    public void deleteLectureForClass(Integer id) {

        Session session = sessionFactory.getCurrentSession();

        Lectures lectures = session.get(Lectures.class , id);
        if (lectures!=null){
            session.delete(lectures);
        }


    }
}
