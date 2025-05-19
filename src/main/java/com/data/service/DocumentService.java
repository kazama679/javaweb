package com.data.service;

import com.data.model.Document;
import org.springframework.stereotype.Service;
import java.io.File;
import java.io.IOException;

@Service
public class DocumentService {
    private static final String UPLOAD_DIR = "uploads/";
    public boolean saveDocument(Document document) {
        try {
            File uploadDir = new File(UPLOAD_DIR);
            if (!uploadDir.exists()) {
                uploadDir.mkdirs();
            }
            String filePath = UPLOAD_DIR + document.getFile().getOriginalFilename();
            document.getFile().transferTo(new File(filePath));
            document.setFilePath("/uploads/" + document.getFile().getOriginalFilename());
            saveToDatabase(document);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private void saveToDatabase(Document document) {
        System.out.println("Lưu vào CSDL: " + document.getTitle() + " - " + document.getFilePath());
    }
}