package com.ltp.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.ltp.hello_spring.Item;
import com.ltp.hello_spring.service.ItemService;

import jakarta.validation.Valid;

@Controller
public class ItemController {
    ItemService itemService = new ItemService();

    @GetMapping("/store")
    public String getStore(Model model, @RequestParam(required = false) String id) {
        // model.addAttribute("categories", Constants.CATEGORIES);

        model.addAttribute("item", itemService.getItem(id));
        return "/global-superstore/form";
    }

    @GetMapping("/inventory")
    public String getInventory(Model model) {
        model.addAttribute("items", itemService.getItems());
        return "/global-superstore/inventory";
    }

    @PostMapping("/handleSubmitItem")
    public String postItem(@Valid Item item, BindingResult result, RedirectAttributes redirectAttributes) {
       
        if (item.getPrice() < item.getDiscount())
            result.rejectValue("discount", "", "Discount can't be more than original price");
        if (result.hasErrors()) {
            return "/global-superstore/form";
        }
        String status = itemService.submitItem(item);
        redirectAttributes.addFlashAttribute("status", status);

        return "redirect:inventory";

    }

}
