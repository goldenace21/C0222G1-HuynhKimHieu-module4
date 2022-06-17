package com.example.service;

import com.example.model.Product;

import java.util.List;

public interface ProductServce {
    List<Product> products();

    void addNew(Product product);

    void update(Product product);

    void delete(String id);

    List<Product> searchByName(String name);

    Product detail(String id);
}
