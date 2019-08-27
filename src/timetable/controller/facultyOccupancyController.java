package timetable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import timetable.Dao.facultyOccupancyDao;
import timetable.Dao.teacherDao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class facultyOccupancyController{

    private facultyOccupancyDao facultyOccupancyDao;
    private teacherDao teacherDao;

    @Autowired
    public facultyOccupancyController(facultyOccupancyDao facultyOccupancyDao , teacherDao teacherDao) {
        this.facultyOccupancyDao = facultyOccupancyDao;
        this.teacherDao = teacherDao;
    }

    @RequestMapping("/faculty")
    public String getFacultyOccupancyReport(Model model , HttpSession session){
        if (session.getAttribute("user") == null) {
            return "login";
        }
        model.addAttribute("allTeachers" , facultyOccupancyDao.getTeachersForReport());
        return "facultyOccupancy";
    }

    @RequestMapping(value = "/deleteFaculty" , method = RequestMethod.GET)
    public String deleteFaculty(@RequestParam("id") String code , Model model , HttpSession session){
        if (session.getAttribute("user") == null) {
            return "login";
        }
        teacherDao.deleteFaculty(code);

        model.addAttribute("allTeachers" , teacherDao.getallTeachers());
        model.addAttribute("allVariables" , teacherDao.getAllTeacherVariable());
        return "facultyList";
    }

    @RequestMapping(value = "/editFacultyPage" , method = RequestMethod.GET)
    public String editFaculty(Model model , @RequestParam("id") String code , HttpSession session){
        if (session.getAttribute("user") == null) {
            return "login";
        }
        model.addAttribute("theTeacher" , teacherDao.getTeacher(code));

        return "editFaculty";
    }

    @RequestMapping(value = "/editFacultyInfo" , method = RequestMethod.POST)
    public String editFaculty(HttpSession session , Model model ,@RequestParam("oldCode") String oldCode, @RequestParam("code") String code , @RequestParam("firstname") String firstname , @RequestParam("lastname") String lastname){
        if (session.getAttribute("user") == null) {
            return "login";
        }
        String message = teacherDao.updateTeacher(oldCode ,code , firstname , lastname);
        model.addAttribute("message" , message);
        model.addAttribute("allTeachers" , teacherDao.getallTeachers());
        model.addAttribute("allVariables" , teacherDao.getAllTeacherVariable());

        return "facultyList";
    }

    @RequestMapping(value = "/addFaculty" , method = RequestMethod.POST)
    public String addFaculty(HttpSession session , Model model , @RequestParam("code") String code , @RequestParam("firstname") String firstname , @RequestParam("lastname") String lastname){
        if (session.getAttribute("user") == null) {
            return "login";
        }
        String message = teacherDao.addTeacher(code , firstname , lastname);
        model.addAttribute("allTeachers" , teacherDao.getallTeachers());
        model.addAttribute("allVariables" , teacherDao.getAllTeacherVariable());
        model.addAttribute("message" , message);

        return "facultyList";
    }

    @RequestMapping(value = "/addFacultyVariable" , method = RequestMethod.POST)
    public String addFacultyVariable(HttpSession session , Model model , @RequestParam("vname") String vname){
        if (session.getAttribute("user") == null) {
            return "login";
        }
        String message1 = teacherDao.addFacultyVar(vname);
        model.addAttribute("allTeachers" , teacherDao.getallTeachers());
        model.addAttribute("allVariables" , teacherDao.getAllTeacherVariable());
        model.addAttribute("message1" , message1);

        return "facultyList";
    }

    @RequestMapping(value = "/editFacultyVariablePage" , method = RequestMethod.GET)
    public String editFacultyVariable(HttpSession session , Model model , @RequestParam("id") String code){
        if (session.getAttribute("user") == null) {
            return "login";
        }
        model.addAttribute("theTeacher" , teacherDao.getTeacher(code));
        return "editFacultyVariable";
    }

    @RequestMapping(value = "/editFacultyVariable" , method = RequestMethod.POST)
    public String editFacultyVariable(HttpServletRequest request , HttpSession session , Model model , @RequestParam("oldCode") String oldCode , @RequestParam("code") String code){
        if (session.getAttribute("user") == null) {
            return "login";
        }

        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String message1 = teacherDao.updateTeacherVariable(oldCode ,code , firstname , lastname);
        model.addAttribute("message1",message1);
        model.addAttribute("allTeachers" , teacherDao.getallTeachers());
        model.addAttribute("allVariables" , teacherDao.getAllTeacherVariable());

        return "facultyList";
    }

    @RequestMapping(value = "/getFacultyTimeTable" , method = RequestMethod.GET)
    public String getFacultyTimeTable(HttpSession session , Model model , @RequestParam("id") String code){
        if (session.getAttribute("user") == null) {
            return "login";
        }
        model.addAttribute("theTeacher" , teacherDao.getTeacher(code));
        return "facultyTimeTable";
    }

    @RequestMapping(value = "/getFacultyVariableTimeTable" , method = RequestMethod.GET)
    public String getFacultyVariableTimeTable(HttpSession session , Model model , @RequestParam("id") String code){
        if (session.getAttribute("user") == null) {
            return "login";
        }
        model.addAttribute("theTeacher" , teacherDao.getTeacher(code));
        return "variableTimeTable";
    }

    @RequestMapping(value = "/getFacultyLectures" , method = RequestMethod.GET)
    public String getLecturesForFaculty(HttpSession session , Model model , @RequestParam("id") String code){
        if (session.getAttribute("user") == null) {
            return "login";
        }

        model.addAttribute("theTeacher" , teacherDao.getTeacher(code));
        return "lectureListForFaculty";
    }

    @RequestMapping(value = "/deleteLecturesForFaculty" , method = RequestMethod.GET)
    public String deleteAllLecturesForFaculty(HttpSession session , Model model , @RequestParam("id") String code){
        if (session.getAttribute("user") == null) {
            return "login";
        }

        teacherDao.deleteFacultyLectures(code);

        model.addAttribute("allTeachers" , teacherDao.getallTeachers());
        model.addAttribute("allVariables" , teacherDao.getAllTeacherVariable());

        return "facultyList";
    }
}
