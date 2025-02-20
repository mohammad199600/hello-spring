package com.ltp.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String getHome(Model model) {
        model.addAttribute("name", "Eid");
        return "home";
    }

    @GetMapping("/away")
    public String getAway(Model model) {
        model.addAttribute("name", "Eid");
        return "away";
    }
}
