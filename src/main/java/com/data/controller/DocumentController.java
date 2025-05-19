package com.data.controller;

import com.data.model.Document;
import com.data.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class DocumentController {
    @Autowired
    private DocumentService documentService;

    @GetMapping("/documentForm")
    public String documentForm(Model model) {
        model.addAttribute("document", new Document());
        return "documentForm";
    }

    @PostMapping("/uploadDocument")
    public String uploadDocument(@ModelAttribute("document") Document document,
                                 RedirectAttributes redirectAttributes) {
        boolean isUploaded = documentService.saveDocument(document);
        if (isUploaded) {
            redirectAttributes.addFlashAttribute("message", "Tài liệu đã được upload thành công!");
        } else {
            redirectAttributes.addFlashAttribute("message", "Upload thất bại.");
        }
        return "redirect:/documentForm";
    }
}