package com.example.product.service;

import com.example.product.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Page<Product> products(Pageable pageable, String name);

    void addNew(Product product);

    void update(Product product);

    void deleteById(Integer id);

    Product findById(Integer id);
}
