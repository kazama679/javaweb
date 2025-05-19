package com.data.controller;

import com.data.model.Document;
import com.data.model.DocumentBai7;
import com.data.model.Project;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
public class ProjectController {

    private static final String UPLOAD_DIR = "uploads/projects/";

    @GetMapping("/projectForm")
    public String showProjectForm(Model model) {
        model.addAttribute("project", new Project());
        return "projectForm";
    }

    @PostMapping("/createProject")
    public String createProject(@ModelAttribute("project") Project project, RedirectAttributes redirectAttributes) {
        // Tạo thư mục lưu file nếu chưa có
        File uploadDir = new File(UPLOAD_DIR);
        if (!uploadDir.exists()) {
            uploadDir.mkdirs();
        }

        List<DocumentBai7> docs = project.getDocuments();
        if (docs != null) {
            for (DocumentBai7 doc : docs) {
                MultipartFile file = doc.getFile();
                if (file != null && !file.isEmpty()) {
                    try {
                        String filePath = UPLOAD_DIR + file.getOriginalFilename();
                        file.transferTo(new File(filePath));
                        // Lưu filePath hoặc các thông tin khác vào DB tùy bạn thiết kế
                    } catch (IOException e) {
                        e.printStackTrace();
                        redirectAttributes.addFlashAttribute("message", "Upload file thất bại: " + file.getOriginalFilename());
                        return "redirect:/projectForm";
                    }
                }
            }
        }

        // TODO: Lưu thông tin project + danh sách tài liệu vào DB

        redirectAttributes.addFlashAttribute("message", "Tạo dự án thành công!");
        return "redirect:/projectForm";
    }

    // Bạn có thể tạo các phương thức updateProject() và deleteProject() tương tự
}