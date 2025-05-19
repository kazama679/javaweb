package com.data.controller;

import com.data.model.UserProfile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.File;
import java.io.IOException;

@Controller
public class ProfileController {
    private static final String UPLOAD_DIR = "uploads/";
    @GetMapping("/uploadForm")
    public String uploadForm(Model model) {
        model.addAttribute("userProfile", new UserProfile());
        return "uploadForm";
    }

    @PostMapping("/uploadAvatar")
    public String uploadAvatar(@ModelAttribute("userProfile") UserProfile userProfile,
                               RedirectAttributes redirectAttributes) {
        MultipartFile avatar = userProfile.getAvatar();
        String username = userProfile.getUsername();
        if (avatar.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Vui lòng chọn file để upload.");
            return "redirect:/uploadForm";
        }
        try {
            File uploadDir = new File(UPLOAD_DIR);
            if (!uploadDir.exists()) {
                uploadDir.mkdirs();
            }
            String filePath = UPLOAD_DIR + avatar.getOriginalFilename();
            avatar.transferTo(new File(filePath));
            redirectAttributes.addFlashAttribute("message", "Upload thành công!");
            redirectAttributes.addFlashAttribute("username", username);
            redirectAttributes.addFlashAttribute("avatarPath", filePath);
        } catch (IOException e) {
            e.printStackTrace();
            redirectAttributes.addFlashAttribute("message", "Upload thất bại.");
        }
        return "redirect:/uploadForm";
    }
}