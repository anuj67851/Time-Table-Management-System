package timetable.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import timetable.entity.Classroom;
import timetable.entity.Tclassroom;
import timetable.entity.Users;

import java.util.List;

@Repository
public class userDao {
    private SessionFactory sessionFactory;

    @Autowired

    public userDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public Users updateUserData(Integer id ,String password , String firstname , String lastname){
        Session session = sessionFactory.getCurrentSession();

        Users user = session.get(Users.class , id);

        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setPassword(password);

        session.save(user);

        return user;

    }

    @Transactional
    public List<Users> getAllUsers(){
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("From Users " , Users.class).getResultList();
    }

    @Transactional
    public String addUser(String username, String password, String firstname, String lastname) {
        Session session = sessionFactory.getCurrentSession();
        Users user = session.createQuery("From Users u where u.username = :username",Users.class).setParameter("username" ,username).uniqueResult();

        if (user != null) {
            return "Username Occupied";
        }

        Users users = new Users();
        users.setUsername(username);
        users.setPassword(password);
        users.setFirstname(firstname);
        users.setLastname(lastname);
        session.save(users);

        return "User added successfully";
    }

    @Transactional
    public void deleteUser(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(session.get(Users.class , id));
    }
}
