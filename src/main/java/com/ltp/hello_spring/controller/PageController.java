package com.ltp.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/page")
    public String getPage(Model model) {
        model.addAttribute("name", "Eid");
        return "page";
    }
}
