package timetable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import timetable.Dao.subjectDao;
import timetable.Dao.acDao;
import timetable.entity.Academicclasses;

import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
public class subjectController {
    private subjectDao subjectDao;
    private acDao acDao;

    @Autowired
    public subjectController(subjectDao subjectDao , acDao acDao) {
        this.subjectDao = subjectDao;
        this.acDao = acDao;
    }

    @RequestMapping("/getSubjectList")
    public String getAllSubjects(HttpSession session , Model model){
        if (session.getAttribute("user") == null) {
            return "login";
        }
        model.addAttribute("allSubjects" , subjectDao.getAllSubjects());

        List<Academicclasses> academicclassesList = acDao.getAllAcCombined();

        model.addAttribute("allAcademicClasses" , academicclassesList);

        return "subjectList";
    }

    @RequestMapping("/addSubject")
    public String addSubject(HttpSession session , Model model , @RequestParam("scode") String scode , @RequestParam("name") String name , @RequestParam("shortCode") String shortCode , @RequestParam("semester") String semester , @RequestParam("elective") int elective){
        if (session.getAttribute("user") == null) {
            return "login";
        }

        semester = semester.toUpperCase();
        model.addAttribute("message" , subjectDao.addSubject(scode,name,shortCode,semester,elective));
        model.addAttribute("allSubjects" , subjectDao.getAllSubjects());
        List<Academicclasses> academicclassesList = acDao.getAllAcCombined();

        model.addAttribute("allAcademicClasses" , academicclassesList);


        return "subjectList";
    }

    @RequestMapping(value = "editSubjectPage" , method = RequestMethod.GET)
    public String getSubjectEditPage(HttpSession session , Model model , @RequestParam("id") String scode){
        if (session.getAttribute("user") == null) {
            return "login";
        }

        model.addAttribute("theSubject" , subjectDao.getSubject(scode));

        List<Academicclasses> academicclassesList = acDao.getAllAcCombined();

        model.addAttribute("allAcademicClasses" , academicclassesList);

        return "editSubject";
    }

    @RequestMapping(value = "/editSubject" , method = RequestMethod.POST)
    public String editSubject(HttpSession session ,@RequestParam("oldShortCode") String oldShortCode , Model model ,@RequestParam("oldCode") String oldCode, @RequestParam("code") String scode , @RequestParam("name") String name , @RequestParam("shortCode") String shortCode , @RequestParam("semester") String semester, @RequestParam("elective") int elective){
        if (session.getAttribute("user") == null) {
            return "login";
        }

        semester = semester.toUpperCase();

        model.addAttribute("message" , subjectDao.editSubject(oldCode ,oldShortCode ,scode,name,shortCode,semester,elective));
        model.addAttribute("allSubjects" , subjectDao.getAllSubjects());
        List<Academicclasses> academicclassesList = acDao.getAllAcCombined();

        model.addAttribute("allAcademicClasses" , academicclassesList);


        return "subjectList";
    }

    @RequestMapping(value = "/deleteSubject" , method = RequestMethod.GET)
    public String deleteUser(@RequestParam("id") String code , Model model , HttpSession session){
        if (session.getAttribute("user") == null) {
            return "login";
        }
        subjectDao.deleteSubject(code);

        model.addAttribute("allSubjects" , subjectDao.getAllSubjects());
        List<Academicclasses> academicclassesList = acDao.getAllAcCombined();

        model.addAttribute("allAcademicClasses" , academicclassesList);

        return "subjectList";
    }

}
