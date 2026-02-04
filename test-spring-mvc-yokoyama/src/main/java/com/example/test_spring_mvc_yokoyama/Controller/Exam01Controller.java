package com.example.test_spring_mvc_yokoyama.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam01")
public class Exam01Controller {
    
    @RequestMapping("/show-self-introduction")
    public String showSelfIntroduction(){
        return "redirect:/exam01/index";
    }

    @RequestMapping("/index")
    public String index(){
        return "exam-01";
    }

  

}
