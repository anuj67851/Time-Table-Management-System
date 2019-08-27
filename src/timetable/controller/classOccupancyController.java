package timetable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import timetable.Dao.classOccupancyDao;
import timetable.Dao.classDao;
import timetable.Dao.teacherDao;

import javax.servlet.http.HttpSession;

@Controller
public class classOccupancyController {

    private classOccupancyDao classOccupancyDao;
    private classDao classDao;

    @Autowired
    public classOccupancyController(classOccupancyDao classOccupancyDao , classDao classDao) {
        this.classOccupancyDao = classOccupancyDao;
        this.classDao = classDao;
    }

    @RequestMapping("/class")
    public String getFacultyOccupancyReport(Model model , HttpSession session){
        if (session.getAttribute("user") == null) {
            return "login";
        }
        model.addAttribute("allClass" , classOccupancyDao.getclassForReport());
        return "classOccupancy";
    }

    @RequestMapping("/getClassList")
    public String getClassListPage(Model model , HttpSession session){
        if (session.getAttribute("user") == null) {
            return "login";
        }
        model.addAttribute("allClasses" , classDao.getAllClasses());

        return "classList";
    }

    @RequestMapping(value = "/addClassroom" , method = RequestMethod.POST)
    public String addFaculty(HttpSession session , Model model , @RequestParam("code") String code, @RequestParam("variable") Integer isVar){
        if (session.getAttribute("user") == null) {
            return "login";
        }
        String message = classDao.addClassroom(code,isVar);
        model.addAttribute("allClasses" , classDao.getAllClasses());
        model.addAttribute("message" , message);

        return "classList";
    }

    @RequestMapping(value = "/editClassroomPage" , method = RequestMethod.GET)
    public String editFaculty(Model model , @RequestParam("id") String code , HttpSession session){
        if (session.getAttribute("user") == null) {
            return "login";
        }
        model.addAttribute("theClassroom" , classDao.getClassroom(code));

        return "editClassroom";
    }

    @RequestMapping(value = "/editClassroomInfo" , method = RequestMethod.POST)
    public String editFaculty(HttpSession session , Model model ,@RequestParam("oldCode") String oldCode, @RequestParam("code") String code, @RequestParam("variable") Integer isVar){
        if (session.getAttribute("user") == null) {
            return "login";
        }
        String message = classDao.updateClassroom(oldCode ,code,isVar);
        model.addAttribute("message" , message);
        model.addAttribute("allClasses" , classDao.getAllClasses());

        return "classList";
    }

    @RequestMapping(value = "/deleteClassroom" , method = RequestMethod.GET)
    public String deleteFaculty(@RequestParam("id") String code , Model model , HttpSession session){
        if (session.getAttribute("user") == null) {
            return "login";
        }
        classDao.deleteClassroom(code);

        model.addAttribute("allClasses" , classDao.getAllClasses());
        return "classList";
    }

    @RequestMapping(value = "/getClassroomTimeTable" , method = RequestMethod.GET)
    public String getFacultyTimeTable(HttpSession session , Model model , @RequestParam("id") String code){
        if (session.getAttribute("user") == null) {
            return "login";
        }
        model.addAttribute("theClass" , classDao.getClassroom(code));
        return "classroomTimeTable";
    }


    @RequestMapping(value = "/getClassLectures" , method = RequestMethod.GET)
    public String getLecturesForFaculty(HttpSession session , Model model , @RequestParam("id") String code){
        if (session.getAttribute("user") == null) {
            return "login";
        }

        model.addAttribute("theClass" , classDao.getClassroom(code));
        return "lectureListForClass";
    }

    @RequestMapping(value = "/deleteLecturesForClassroom" , method = RequestMethod.GET)
    public String deleteAllLecturesForFaculty(HttpSession session , Model model , @RequestParam("id") String code){
        if (session.getAttribute("user") == null) {
            return "login";
        }

        classDao.deleteLecturesForClass(code);

        model.addAttribute("allClasses" , classDao.getAllClasses());
        return "classList";
    }

}
