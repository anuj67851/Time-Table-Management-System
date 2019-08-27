package timetable.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import timetable.Dao.acDao;
import timetable.Dao.insertTimeTableData;
import timetable.utility.insertTimeTableUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class insertionController{

    private acDao acDao;
    private insertTimeTableData insertTimeTableData;

    @Autowired
    public insertionController(acDao acDao ,  insertTimeTableData insertTimeTableData) {
        this.acDao = acDao;
        this.insertTimeTableData = insertTimeTableData;
    }

    @RequestMapping(value = "/insertData" , method = RequestMethod.POST)
    public String getConfirmPage(HttpServletRequest request , Model model , HttpSession session){

        if (session.getAttribute("user") == null) {
            return "login";
        }
        insertTimeTableData.insertTimetable(request);

        model.addAttribute("message" , "TimeTable Inserted Successfully");
        model.addAttribute("allAcademicsNormal" , acDao.getAllAcNormal());
        model.addAttribute("allAcademicsCombined" , acDao.getAllAcCombined());
        return "insertTimeTablePrePage";
    }

}
