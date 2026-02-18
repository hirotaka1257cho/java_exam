package com.example.test_spring_thymeleaf_yokoyama.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test_spring_thymeleaf_yokoyama.domain.Member;

@Controller
@RequestMapping("/exam2")
public class ExamThymeleafController {

    @RequestMapping("")
    public String index(){
        return "ex-thymeleaf-input";
    }

    @RequestMapping("/result")
    public String result(Member member, Model model){
        model.addAttribute("member", member);
        model.addAttribute("memberList", member.getHobbyList());
        return "ex-thymeleaf-result";
    }
}
