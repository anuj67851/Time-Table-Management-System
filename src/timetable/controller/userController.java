package timetable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import timetable.Dao.userDao;
import timetable.entity.Users;

import javax.servlet.http.HttpSession;

@Controller
public class userController{

    private userDao userDao;

    @Autowired
    public userController(timetable.Dao.userDao userDao) {
        this.userDao = userDao;
    }

    @RequestMapping("/getUsersList")
    public String getAllUsers(Model model , HttpSession session){
        if (session.getAttribute("user") == null) {
            return "login";
        }

        model.addAttribute("allUsers", userDao.getAllUsers());

        return "userList";
    }

    @RequestMapping(value = "/addUser" , method = RequestMethod.POST)
    public String addUser(Model model , HttpSession session , @RequestParam("username") String username , @RequestParam("password") String password , @RequestParam("firstname") String firstname , @RequestParam("lastname") String lastname){
        if (session.getAttribute("user") == null) {
            return "login";
        }

        String message = userDao.addUser(username,password,firstname,lastname);
        model.addAttribute("allUsers" , userDao.getAllUsers());
        model.addAttribute("message" , message);

        return "userList";
    }

    @RequestMapping(value = "/deleteUser" , method = RequestMethod.GET)
    public String deleteUser(@RequestParam("id") String code , Model model , HttpSession session){
        if (session.getAttribute("user") == null) {
            return "login";
        }
        userDao.deleteUser(Integer.valueOf(code));

        Users users = (Users)session.getAttribute("user");
        if (users.getId() == Integer.valueOf(code)){
            session.setAttribute("user",null);
            return "login";
        }

        model.addAttribute("allUsers" , userDao.getAllUsers());
        return "userList";
    }
}
