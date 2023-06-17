package com.example.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@Controller
public class InnerController {
    @RequestMapping("/ab")
    public String hello(){
        return "testhtml";
    }

    @PostMapping("/abc")
    public String abc(String firstName, String lastName, Model model){
        String message = "您的名字是：" +firstName + lastName;
        model.addAttribute("message",message);
        return "js";
    }

}