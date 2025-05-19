package com.data.model;

public class User {
    private int id;
    private String name;
    private int age;
    private String address;

    public User() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String address, int age, int id, String name) {
        this.address = address;
        this.age = age;
        this.id = id;
        this.name = name;
    }
}
