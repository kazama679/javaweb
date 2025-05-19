package com.data.controller;

import com.data.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @GetMapping("userForm")
    public String userForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "userForm";
    }

    @PostMapping("userSave")
    public String userSave(@ModelAttribute("user") User user, Model model) {
        model.addAttribute("user", user);
        return "userSave";
    }
}