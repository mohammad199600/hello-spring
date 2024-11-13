package com.ltp.hello_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.ltp.hello_spring.Grade;
import com.ltp.hello_spring.service.GradeService;

import jakarta.validation.Valid;

@Controller
public class GradeController {
    GradeService gradeService;

    public GradeController(GradeService gradeService){
        this.gradeService=gradeService;
    }

    @GetMapping("/form")
    public String getForm(Model model, @RequestParam(required = false) String id) {
        model.addAttribute("grade", gradeService.getGrade(id));
        return "form";
    }

    @GetMapping("/grades")
    public String getGrades(Model model) {
        model.addAttribute("grades", gradeService.getGrades());
        return "grades";
    }

    @PostMapping("/handleSubmit")
    public String postGrade(@Valid Grade grade, BindingResult result) {
        if (result.hasErrors())
            return "form";
        gradeService.submitGrade(grade);

        return "redirect:grades";

    }

}
