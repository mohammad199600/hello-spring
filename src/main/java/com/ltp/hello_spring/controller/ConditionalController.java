package com.ltp.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConditionalController {
    @GetMapping("/conditionals")
    public String getSales(Model model) {
        model.addAttribute("sales", 30);
        model.addAttribute("product", "chair");
        model.addAttribute("speed", 10);
        model.addAttribute("painting", "starry-night");
        model.addAttribute("budget", 40000);
        model.addAttribute("make", "toyota");

        return "conditionals";
    }
}
