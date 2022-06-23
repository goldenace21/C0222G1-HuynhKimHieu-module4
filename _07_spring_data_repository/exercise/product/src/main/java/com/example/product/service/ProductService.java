package com.example.product.service;

import com.example.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    List<Product> products();

    void addNew(Product product);

    void update(Product product);

    void delete(Product product);

    List<Product> searchByName(String name);

    Product detail(String id);
}
