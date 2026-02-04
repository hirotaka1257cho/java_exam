package com.example.test_spring_mvc_yokoyama.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {

    @RequestMapping("/show-company-introduction")
    public String showCompanyIntroduction(){
        return "redirect:/exam02/index";
    }

    @RequestMapping("/index")
    public String index(){
        return "exam-02";
    }

    
}
