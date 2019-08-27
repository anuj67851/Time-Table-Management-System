package timetable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import timetable.Dao.*;
import timetable.entity.Users;
import timetable.utility.insertTimeTableUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class indexController {

    private insertTimeTableUtil insertTimeTableUtil;
    private loginDao loginDao;
    private teacherDao teacherDao;
    private classDao classDao;
    private subjectDao subjectDao;
    private lecturesDao lecturesDao;
    private userDao userDao;

    @Autowired
    public indexController(userDao userDao, lecturesDao lecturesDao, insertTimeTableUtil insertTimeTableUtil, loginDao loginDao, teacherDao teacherDao, classDao classDao, subjectDao subjectDao) {
        this.insertTimeTableUtil = insertTimeTableUtil;
        this.loginDao = loginDao;
        this.teacherDao = teacherDao;
        this.classDao = classDao;
        this.subjectDao = subjectDao;
        this.lecturesDao = lecturesDao;
        this.userDao = userDao;
    }

    @RequestMapping("/")
    public String getLoginPage() {
        return "login";
    }

    @RequestMapping(value = "/handleLogin", method = RequestMethod.POST)
    public String handleLogin(Model model, HttpSession session, @RequestParam("username") String username, @RequestParam("password") String password) {

        if (loginDao.doLogin(username, password)) {
            Users user = loginDao.getUser(username, password);
            session.setAttribute("user", user);

            model.addAttribute("TeacherCount", teacherDao.getTeacherCount());
            model.addAttribute("ClassCount", classDao.getClassCount());
            model.addAttribute("SubjectCount", subjectDao.getSubjectCount());
            model.addAttribute("lectures", lecturesDao.getAllLecturesIndex());
            return "index";
        } else {
            model.addAttribute("message", "Incorrect Username or Password");
            return "login";
        }
    }

    @RequestMapping("/logout")
    public String doLogOut(HttpSession session){
        if (session.getAttribute("user") == null) {
            return "login";
        }

        session.setAttribute("user" , null);
        return "login";
    }

    @RequestMapping("/dashboard")
    public String getIndexPage(Model model, HttpSession session) {

        if (session.getAttribute("user") == null) {
            return "login";
        }

        model.addAttribute("TeacherCount", teacherDao.getTeacherCount());
        model.addAttribute("ClassCount", classDao.getClassCount());
        model.addAttribute("SubjectCount", subjectDao.getSubjectCount());
        model.addAttribute("lectures", lecturesDao.getAllLecturesIndex());
        return "index";
    }


    @RequestMapping("/myProfile")
    public String getProfilePage(HttpSession session, Model model) {
        if (session.getAttribute("user") == null) {
            return "login";
        }
        model.addAttribute("theUser", (Users) session.getAttribute("user"));
        return "profile";
    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public String updateUser(HttpSession session, Model model, HttpServletRequest request) {
        if (session.getAttribute("user") == null) {
            return "login";
        }
        Users user = (Users) session.getAttribute("user");

        user = userDao.updateUserData(user.getId(), request.getParameter("password"), request.getParameter("firstname"), request.getParameter("lastname"));
        session.setAttribute("user", user);
        model.addAttribute("theUser", (Users) session.getAttribute("user"));
        return "profile";
    }


    @RequestMapping("/getAllTeachersPage")
    public String getTeachers(HttpSession session , Model model) {
        if (session.getAttribute("user") == null) {
            return "login";
        }

        model.addAttribute("allTeachers" , teacherDao.getallTeachers());
        model.addAttribute("allVariables" , teacherDao.getAllTeacherVariable());

        return "facultyList";

    }








    @RequestMapping(value = "/getTimeTableInsertPage" , method = RequestMethod.POST)
    public String getTimeTablePage(Model model , HttpSession session , @RequestParam("ac") String aclass) {
        if (session.getAttribute("user") == null) {
            return "login";
        }

        model.addAttribute("aclass", aclass);

        //Monday

        model.addAttribute("twom1m2", insertTimeTableUtil.getScriptTwoChanger("m1", "m2", aclass));
        model.addAttribute("fourm1m2", insertTimeTableUtil.getScriptFourChanger("m1", "m2", aclass));
        model.addAttribute("twom3m4", insertTimeTableUtil.getScriptTwoChanger("m3", "m4", aclass));
        model.addAttribute("fourm3m4", insertTimeTableUtil.getScriptFourChanger("m3", "m4", aclass));
        model.addAttribute("twom5m6", insertTimeTableUtil.getScriptTwoChanger("m5", "m6", aclass));
        model.addAttribute("fourm5m6", insertTimeTableUtil.getScriptFourChanger("m5", "m6", aclass));

        //Tuesday

        model.addAttribute("twotue1tue2", insertTimeTableUtil.getScriptTwoChanger("tue1", "tue2", aclass));
        model.addAttribute("fourtue1tue2", insertTimeTableUtil.getScriptFourChanger("tue1", "tue2", aclass));
        model.addAttribute("twotue3tue4", insertTimeTableUtil.getScriptTwoChanger("tue3", "tue4", aclass));
        model.addAttribute("fourtue3tue4", insertTimeTableUtil.getScriptFourChanger("tue3", "tue4", aclass));
        model.addAttribute("twotue5tue6", insertTimeTableUtil.getScriptTwoChanger("tue5", "tue6", aclass));
        model.addAttribute("fourtue5tue6", insertTimeTableUtil.getScriptFourChanger("tue5", "tue6", aclass));

        //Wednesday

        model.addAttribute("twow1w2", insertTimeTableUtil.getScriptTwoChanger("w1", "w2", aclass));
        model.addAttribute("fourw1w2", insertTimeTableUtil.getScriptFourChanger("w1", "w2", aclass));
        model.addAttribute("twow3w4", insertTimeTableUtil.getScriptTwoChanger("w3", "w4", aclass));
        model.addAttribute("fourw3w4", insertTimeTableUtil.getScriptFourChanger("w3", "w4", aclass));
        model.addAttribute("twow5w6", insertTimeTableUtil.getScriptTwoChanger("w5", "w6", aclass));
        model.addAttribute("fourw5w6", insertTimeTableUtil.getScriptFourChanger("w5", "w6", aclass));

        //Thursday

        model.addAttribute("twoth1th2", insertTimeTableUtil.getScriptTwoChanger("th1", "th2", aclass));
        model.addAttribute("fourth1th2", insertTimeTableUtil.getScriptFourChanger("th1", "th2", aclass));
        model.addAttribute("twoth3th4", insertTimeTableUtil.getScriptTwoChanger("th3", "th4", aclass));
        model.addAttribute("fourth3th4", insertTimeTableUtil.getScriptFourChanger("th3", "th4", aclass));
        model.addAttribute("twoth5th6", insertTimeTableUtil.getScriptTwoChanger("th5", "th6", aclass));
        model.addAttribute("fourth5th6", insertTimeTableUtil.getScriptFourChanger("th5", "th6", aclass));

        //Friday

        model.addAttribute("twof1f2", insertTimeTableUtil.getScriptTwoChanger("f1", "f2", aclass));
        model.addAttribute("fourf1f2", insertTimeTableUtil.getScriptFourChanger("f1", "f2", aclass));
        model.addAttribute("twof3f4", insertTimeTableUtil.getScriptTwoChanger("f3", "f4", aclass));
        model.addAttribute("fourf3f4", insertTimeTableUtil.getScriptFourChanger("f3", "f4", aclass));
        model.addAttribute("twof5f6", insertTimeTableUtil.getScriptTwoChanger("f5", "f6", aclass));
        model.addAttribute("fourf5f6", insertTimeTableUtil.getScriptFourChanger("f5", "f6", aclass));

        //saturday

        model.addAttribute("twos1s2", insertTimeTableUtil.getScriptTwoChanger("s1", "s2", aclass));
        model.addAttribute("fours1s2", insertTimeTableUtil.getScriptFourChanger("s1", "s2", aclass));
        model.addAttribute("twos3s4", insertTimeTableUtil.getScriptTwoChanger("s3", "s4", aclass));
        model.addAttribute("fours3s4", insertTimeTableUtil.getScriptFourChanger("s3", "s4", aclass));
        model.addAttribute("twos5s6", insertTimeTableUtil.getScriptTwoChanger("s5", "s6", aclass));
        model.addAttribute("fours5s6", insertTimeTableUtil.getScriptFourChanger("s5", "s6", aclass));

        return "timeTableInsert";
    }

}
