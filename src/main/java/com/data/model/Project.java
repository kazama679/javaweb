package com.data.model;

import java.util.List;

public class Project {
    private String name;
    private String description;
    private List<DocumentBai7> documents;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public List<DocumentBai7> getDocuments() {
        return documents;
    }
    public void setDocuments(List<DocumentBai7> documents) {
        this.documents = documents;
    }
}
