package com.data.controller;

import com.data.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
    @GetMapping("productForm")
    public String productForm(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "productForm";
    }

    @PostMapping("productSave")
    public String productSave(@ModelAttribute("product") Product product, Model model) {
        model.addAttribute("product", product);
        return "productSave";
    }
}
