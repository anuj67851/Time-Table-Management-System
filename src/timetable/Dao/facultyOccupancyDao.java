package timetable.Dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import timetable.entity.Teacher;

import java.util.List;

@Repository
public class facultyOccupancyDao {

    private SessionFactory sessionFactory;

    facultyOccupancyDao() {

    }

    @Autowired
    public facultyOccupancyDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public List<Teacher> getTeachersForReport(){
        return sessionFactory.getCurrentSession().createQuery("from Teacher t where t.isTeacher = 1", Teacher.class).getResultList();
    }

}
