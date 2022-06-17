package com.example.model;

public class Product {
    private String id;
    private String name;
    private String price;
    private String info;
    private String brand;

    public Product() {}

    public Product(String id, String name, String price, String info, String brand) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.info = info;
        this.brand = brand;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
