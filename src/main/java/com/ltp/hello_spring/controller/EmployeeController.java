package com.ltp.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ltp.hello_spring.reposidory.EmployeeReposidory;

@Controller
public class EmployeeController {
 EmployeeReposidory employeeReposidory=new EmployeeReposidory();
    @GetMapping("/staff")
    public String getStaff(Model model) {
        model.addAttribute("employees", employeeReposidory.getEmployees());
        return "staff";
    }
}
