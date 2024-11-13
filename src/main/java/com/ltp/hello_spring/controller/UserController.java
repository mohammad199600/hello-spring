package com.ltp.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ltp.hello_spring.Constants;
import com.ltp.hello_spring.User;
import com.ltp.hello_spring.service.UserService;

import jakarta.validation.Valid;

@Controller
public class UserController {
    UserService userService = new UserService();

    @GetMapping("/signup")
    public String getSignUp(Model model, String id) {
        int index = userService.getIndex(id);
        model.addAttribute("user", index == Constants.NOT_FOUND ? new User() : userService.getUser(index));
        return "sign-up";
    }

    @GetMapping("/result")
    public String getResult(Model model) {
        model.addAttribute("users", userService.getUsers());
        return "result";
    }

    @PostMapping("/handleSubmitUser")
    public String postUser(@Valid User user, BindingResult result) {

        if (user.getFirstName().equals(user.getLastName()))
            result.rejectValue("lastName", "", "Please enter a valid last name");
        if (result.hasErrors()) {
            return "sign-up";
        }
        int index = userService.getIndex(user.getId());
        if (index == Constants.NOT_FOUND)
            userService.addUser(user);
        else
            userService.updateUser(index, user);

        return "redirect:result";
    }
}