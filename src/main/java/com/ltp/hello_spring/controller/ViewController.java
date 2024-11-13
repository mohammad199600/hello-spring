package com.ltp.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    @GetMapping("/view")
    public String getView(Model model) {
        model.addAttribute("menu", "We sell chocolate rice cakes bubble tea");
        return "view";
    }
}
