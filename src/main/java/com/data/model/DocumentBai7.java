package com.data.model;

import org.springframework.web.multipart.MultipartFile;

public class DocumentBai7 {private MultipartFile file;
    private String description;
    public DocumentBai7() {}

    public MultipartFile getFile() {
        return file;
    }
    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

}
