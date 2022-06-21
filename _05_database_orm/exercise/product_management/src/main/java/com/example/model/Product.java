package com.example.model;

import javax.persistence.*;

@Entity(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "int")
    private String id;
    private String name;
    private String price;
    private String info;
    private String brand;
    @Column(name = "status_delete")
    private int statusDelete;

    public Product(String id, String name, String price, String info, String brand, int statusDelete) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.info = info;
        this.brand = brand;
        this.statusDelete = statusDelete;
    }

    public Product() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getInfo() {
        return info;
    }

    public String getBrand() {
        return brand;
    }

    public int getStatusDelete() {
        return statusDelete;
    }
}
