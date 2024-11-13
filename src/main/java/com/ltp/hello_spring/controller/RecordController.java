package com.ltp.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ltp.hello_spring.reposidory.RecordReposidory;

@Controller
public class RecordController {
    RecordReposidory recordReposidory=new RecordReposidory();
     @GetMapping("/records")
    public String getRecord(Model model) {
        model.addAttribute("records", recordReposidory.getRecords());
        return "records";
    }

}
