package com.example.product.repository;

import com.example.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, String> {

    List<Product> findAll();

    void addNew(Product product);

    void update(Product product);

    void delete(Product product);

    List<Product> searchByName(String name);

    Product detail(String id);
}
