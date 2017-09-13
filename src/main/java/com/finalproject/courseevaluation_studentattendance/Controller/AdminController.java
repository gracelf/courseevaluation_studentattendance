package com.finalproject.courseevaluation_studentattendance.Controller;

import com.finalproject.courseevaluation_studentattendance.Services.AttendenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
@Autowired
AttendenceService attendenceService;

    @RequestMapping("/home")
    public String adminHome(Model model){

        return "adminpages/adminhome";
    }
}
