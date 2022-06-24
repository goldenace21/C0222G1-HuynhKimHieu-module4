package com.example.product.model;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Entity(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "int")
    private Integer id;

    @Pattern(regexp = "^[\\w\\s]{1,30}$")
    private String name;

    @Pattern(regexp = "^[0-9]+\\.?[0-9]*$")
    private String price;

    @Pattern(regexp = "^[\\w\\s]{1,30}$")
    private String info;

    @Pattern(regexp = "^[\\w\\s]{1,30}$")
    private String brand;

    @Column(name = "status_delete")
    private int statusDelete;

    public Product(Integer id, String name, String price, String info, String brand, int statusDelete) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.info = info;
        this.brand = brand;
        this.statusDelete = statusDelete;
    }

    public Product() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public int getStatusDelete() {
        return statusDelete;
    }

    public void setStatusDelete(int statusDelete) {
        this.statusDelete = statusDelete;
    }
}
