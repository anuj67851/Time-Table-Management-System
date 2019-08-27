package timetable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import timetable.Dao.acDao;
import timetable.Dao.teacherDao;
import timetable.entity.Academicclasses;
import timetable.entity.Lectures;

import java.util.ArrayList;
import java.util.List;

@Controller
public class academicClassController{

    private acDao acDao;

    @Autowired
    public academicClassController(timetable.Dao.acDao acDao) {
        this.acDao = acDao;
    }

    @RequestMapping("/getAcademicClassesPage")
    public String getAcademicClassesPage(Model model , HttpSession session){
        if (session.getAttribute("user") == null) {
            return "login";
        }
        model.addAttribute("allAcademicsNormal" , acDao.getAllAcNormal());
        model.addAttribute("allAcademicsCombined" , acDao.getAllAcCombined());
        return "academicList";
    }

    @RequestMapping(value = "/viewLectures" , method = RequestMethod.GET)
    public String getLecturesForAc(Model model , HttpSession session , @RequestParam("id") String academicClass){
        if (session.getAttribute("user") == null) {
            return "login";
        }

        Academicclasses academicclasses = acDao.getAc(academicClass);
        model.addAttribute("theAcademic" , academicclasses);

        List<Lectures> allLectures = acDao.getAllLecturesForAc(academicClass);

        List<Lectures> mondayLectures = new ArrayList<>();
        List<Lectures> tuesdayLectures = new ArrayList<>();
        List<Lectures> wednesdayLectures = new ArrayList<>();
        List<Lectures> thursdayLectures = new ArrayList<>();
        List<Lectures> fridayLectures = new ArrayList<>();
        List<Lectures> saturdaylectures = new ArrayList<>();


        for (Lectures lectures : allLectures){
            if (lectures.getHours().contains("m")){
                mondayLectures.add(lectures);
            } else if (lectures.getHours().contains("tue")){
                tuesdayLectures.add(lectures);
            } else if (lectures.getHours().contains("w")){
                wednesdayLectures.add(lectures);
            } else if (lectures.getHours().contains("th")){
                thursdayLectures.add(lectures);
            } else if (lectures.getHours().contains("f")){
                fridayLectures.add(lectures);
            } else if (lectures.getHours().contains("s")){
                saturdaylectures.add(lectures);
            }
        }


        model.addAttribute("monday" , mondayLectures);
        model.addAttribute("tuesday" , tuesdayLectures);
        model.addAttribute("wednesday" , wednesdayLectures);
        model.addAttribute("thursday" , thursdayLectures);
        model.addAttribute("friday" , fridayLectures);
        model.addAttribute("saturday" , saturdaylectures);
        model.addAttribute("theSize",allLectures.size());

        return "lectureListForAc";
    }

    @RequestMapping(value = "/deleteAc" , method = RequestMethod.GET)
    public String deleteAc(Model model , HttpSession session , @RequestParam("id") String academicClass){
        if (session.getAttribute("user") == null) {
            return "login";
        }

        acDao.deleteAc(academicClass);

        return "redirect:getAcademicClassesPage";
    }

    @RequestMapping(value = "/addAc" , method = RequestMethod.POST)
    public String addAc(Model model , HttpSession session , @RequestParam("aclass") String academicClass ,@RequestParam("isCombined") String isCombined){
        if (session.getAttribute("user") == null) {
            return "login";
        }
        int combined;
        if (isCombined.equalsIgnoreCase("yes")){
            combined = 1;
        } else {
            combined = 0;
        }
        model.addAttribute("message" , acDao.addAc(academicClass.toUpperCase() , combined));

        return "redirect:getAcademicClassesPage";
    }

    @RequestMapping(value = "/deleteLecturesForAcademicClass" , method = RequestMethod.GET)
    public String deleteAllLecturesForAcademicClass(HttpSession session , Model model , @RequestParam("id") String code){
        if (session.getAttribute("user") == null) {
            return "login";
        }

        acDao.deleteLecturesForAc(code);

        return "redirect:getAcademicClassesPage";
    }

    @RequestMapping(value = "/insertTimeTablePrePage")
    public String getTimeTablePrePage(HttpSession session , Model model){
        if (session.getAttribute("user") == null) {
            return "login";
        }

        model.addAttribute("allAcademicsNormal" , acDao.getAllAcNormal());
        model.addAttribute("allAcademicsCombined" , acDao.getAllAcCombined());
        return "insertTimeTablePrePage";
    }
}
