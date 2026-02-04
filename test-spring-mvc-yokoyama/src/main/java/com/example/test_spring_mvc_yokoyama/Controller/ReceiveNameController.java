package com.example.test_spring_mvc_yokoyama.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Form.ReceiveNameForm;

@Controller
@RequestMapping("/exam03")
public class ReceiveNameController {

    @RequestMapping("")
    public String index(){
        return "name-form";
    }

    @RequestMapping("/index2")
    public String index2(String name){
        System.out.println("入力された値は" + name + "です");
        return "finished";
    }

    @RequestMapping("/index3")
    public String index3(ReceiveNameForm receivenameform){
        System.out.println("入力された値は" + receivenameform.getName() + "です");
        return "finished";
    }
}
