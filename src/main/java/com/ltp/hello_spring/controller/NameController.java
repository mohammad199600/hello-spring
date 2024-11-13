package com.ltp.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NameController {
  @GetMapping("/name")
    public String getName(Model model) {
        model.addAttribute("name", "Eid");
        return "name-list";
    }
}
