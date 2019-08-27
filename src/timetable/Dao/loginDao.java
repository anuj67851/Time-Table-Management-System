package timetable.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import timetable.entity.Users;

import java.util.List;


@Repository
public class loginDao {
    private SessionFactory sessionFactory;

    public loginDao() {

    }

    @Autowired
    public loginDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public boolean doLogin(String username , String password) {

        Session session = sessionFactory.getCurrentSession();
        String hql = "FROM Users u where u.username = :username and u.password = :password";
        List<Users> users = session.createQuery(hql , Users.class)
                .setParameter("username" , username)
                .setParameter("password" , password)
                .getResultList();

        return users.size() > 0;
    }

    @Transactional
    public Users getUser(String username, String password) {
        Session session = sessionFactory.getCurrentSession();
        String hql = "FROM Users u where u.username = :username and u.password = :password";
        List<Users> users = session.createQuery(hql , Users.class)
                .setParameter("username" , username)
                .setParameter("password" , password)
                .getResultList();

        return users.get(0);
    }
}

