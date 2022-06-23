package com.example.product.service;

import com.example.product.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> products();

    void addNew(Product product);

    void update(Product product);

    void deleteById(Integer id);

    List<Product> searchByName(String name);
}
