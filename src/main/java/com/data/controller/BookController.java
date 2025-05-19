package com.data.controller;

import com.data.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {
    @GetMapping("book-form")
    public String bookForm(Model model) {
        Book book = new Book();
        model.addAttribute("book", book);
        return "book_form";
    }

    @PostMapping("book-save")
    public String saveBook(@ModelAttribute("book") Book book, Model model) {
        model.addAttribute("book", book);
        return "book_success";
    }
}