package timetable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import timetable.Dao.lecturesDao;

import javax.servlet.http.HttpSession;

@Controller
public class lectureController {

    private lecturesDao lecturesDao;

    @Autowired
    public lectureController(lecturesDao lecturesDao) {
        this.lecturesDao = lecturesDao;
    }

    @RequestMapping(value = "/deleteLecture" , method = RequestMethod.GET)
    public String deleteLecture(Model model , HttpSession session  , @RequestParam("id") Integer id, @RequestParam("ac") String ac){
        if (session.getAttribute("user") == null) {
            return "login";
        }

        lecturesDao.deleteLecture(id);
        return "redirect:viewLectures?id="+ac;
    }

    @RequestMapping(value = "/deleteLectureForFaculty" , method = RequestMethod.GET)
    public String deleteLectureForFaculty(Model model , HttpSession session  , @RequestParam("id") Integer id , @RequestParam("tcode") String tcode){
        if (session.getAttribute("user") == null) {
            return "login";
        }

        lecturesDao.deleteLectureForFaculty(id);
        return "redirect:getFacultyLectures?id="+tcode;
    }

    @RequestMapping(value = "/deleteLectureForClass" , method = RequestMethod.GET)
    public String deleteLectureForClass(Model model , HttpSession session  , @RequestParam("id") Integer id, @RequestParam("class") String clas){
        if (session.getAttribute("user") == null) {
            return "login";
        }

       lecturesDao.deleteLectureForClass(id);
        return "redirect:getClassLectures?id="+clas;
    }
}
