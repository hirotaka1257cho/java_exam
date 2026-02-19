package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Member;
import com.example.demo.repository.MemberRepository;

@Controller
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberRepository repository;

    @RequestMapping("")
    public String index(Model model) {
        //手順1
        List<Member> memberList = repository.findAll();
        System.out.println(memberList);

        //手順2
        Member member = repository.load(2);
        System.out.println(member);

        //SAVEメソッド
        Member member2 = new Member(); 
        member2.setName("横山広隆"); 
        member2.setAge(26); 
        member2.setDepId(3); 
        Member save = repository.save(member2); 
        System.out.println(save);

        Member member3 = new Member();
        member3.setId(2);
        member3.setName(("シロー"));
        member3.setAge(32);
        member3.setDepId(2);
        Member save2 = repository.save(member3);
        System.out.println(save2);
        
        return "member"; 
    }
}
