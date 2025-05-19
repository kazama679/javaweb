package com.data.model;

public class Product {
    private String name;
    private double price;
    private String des;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String des, String name, double price) {
        this.des = des;
        this.name = name;
        this.price = price;
    }

    public Product() {
    }
}