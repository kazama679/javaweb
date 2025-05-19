package com.data.controller;

import com.data.model.Account;
import com.data.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AccountController {
    @GetMapping("registerForm")
    public String bookForm(Model model) {
        Account account = new Account();
        model.addAttribute("account", account);
        return "registerForm";
    }

    @PostMapping("accountSave")
    public String saveBook(@ModelAttribute("account") Account account, Model model) {
        return "formConfirm";
    }
}