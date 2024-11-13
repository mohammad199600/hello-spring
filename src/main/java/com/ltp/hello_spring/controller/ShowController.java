package com.ltp.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ltp.hello_spring.Show;

@Controller
public class ShowController {
 @GetMapping("/shows")
    public String getShows(Model model) {
        model.addAttribute("show_1", new Show("Breaking Bad", "Ozymandias", 10.0));
        model.addAttribute("show_2", new Show("Attack on Titan", "Hero", 9.9));
        model.addAttribute("show_3", new Show("Attack on Titan", "Perfect Game", 9.9));
        model.addAttribute("show_4", new Show("Star Wars: The Clone Wars", "Victory and Death", 9.9));
        model.addAttribute("show_5", new Show("Mr. Robot", "407 Proxy Authentication Required", 9.9));

        return "shows";
    }

    // @GetMapping("/shows")
    // public ModelAndView getShows() {
    // Map <String,Show> model= new HashMap<String,Show>();
    // ((HashMap<String, Show>) model).put("show_1", new Show("Breaking Bad",
    // "Ozymandias", 10.0));
    // ((HashMap<String, Show>) model).put("show_2", new Show("Attack on Titan",
    // "Hero", 9.9));
    // ((HashMap<String, Show>) model).put("show_3", new Show("Attack on Titan",
    // "Perfect Game", 9.9));
    // ((HashMap<String, Show>) model).put("show_4", new Show("Star Wars: The Clone
    // Wars", "Victory and Death", 9.9));
    // ((HashMap<String, Show>) model).put("show_5", new Show("Mr. Robot", "407
    // Proxy Authentication Required", 9.9));

    // return new ModelAndView("viewName",model);
    // }
}
