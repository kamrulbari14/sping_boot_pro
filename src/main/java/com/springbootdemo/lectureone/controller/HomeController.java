package com.springbootdemo.lectureone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String test(){
        return "index";
    }
    @GetMapping("/demo")
    public String demo(Model model){
        model.addAttribute("name", "Student Information");
        model.addAttribute("hello", "Submit");
        return "demo";
    }
}
