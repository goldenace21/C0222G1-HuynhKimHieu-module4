package com.example.repository;

import com.example.model.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> products();

    void addNew(Product product);

    void update(Product product);

    void delete(Product product);

    List<Product> searchByName(String name);

    Product detail(String id);
}
