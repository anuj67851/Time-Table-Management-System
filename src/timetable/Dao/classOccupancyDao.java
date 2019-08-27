package timetable.Dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import timetable.entity.Classroom;
import timetable.entity.Teacher;

import java.util.List;

@Repository
public class classOccupancyDao {

    private SessionFactory sessionFactory;

    classOccupancyDao() {

    }

    @Autowired
    public classOccupancyDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public List<Classroom> getclassForReport(){
        return sessionFactory.getCurrentSession().createQuery("from Classroom c where c.classroom != 'CC-II' and c.classroom != 'CC-I' and c.isVar=0", Classroom.class).getResultList();
    }

}
