package com.example.test_spring_scope_yokoyama.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test_spring_scope_yokoyama.domain.User;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/exam-bonus")
public class ExamBonusController {

    @Autowired
    private HttpSession session;

    @GetMapping("")
    public String index() {
        return "exam-bonus-input";
    }

    @PostMapping("/login")
    public String login(String email,String password,Model model) {

if(email.equals("yamada@sample.com") && password.equals("yamayama")){            
            User user = new User();
            user.setName("山田太郎");
            user.setEmail("yamada@sample.com");
            user.setAge(18);
            session.setAttribute("user", user);
            return "exam-bonus-result";
        } else {
            model.addAttribute("errorMessage", "ログインに失敗しました");
            return "exam-bonus-input";
        }
    }
}
