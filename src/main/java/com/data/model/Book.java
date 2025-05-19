package com.data.model;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Data
public class Book {
    private int id;
    private String title;
    private String ISBN;
    private double price;
    private MultipartFile fileImage;
    private Date publishedDate;

    public MultipartFile getFileImage() {
        return fileImage;
    }

    public void setFileImage(MultipartFile fileImage) {
        this.fileImage = fileImage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Book(MultipartFile fileImage, int id, String ISBN, double price, Date publishedDate, String title) {
        this.fileImage = fileImage;
        this.id = id;
        this.ISBN = ISBN;
        this.price = price;
        this.publishedDate = publishedDate;
        this.title = title;
    }

    public Book() {
    }
}
