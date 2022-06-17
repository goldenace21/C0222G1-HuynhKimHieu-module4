package com.example.service;

import com.example.model.Product;
import com.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductSerive {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> products() {
        return productRepository.products();
    }

    @Override
    public void addNew(Product product) {
        productRepository.addNew(product);
    }

    @Override
    public void update(Product product) {
        productRepository.update(product);
    }

    @Override
    public void delete(String id) {
        productRepository.delete(id);
    }

    @Override
    public List<Product> searchByName(String name) {
        return productRepository.searchByName(name);
    }

    @Override
    public Product detail(String id) {
        return productRepository.detail(id);
    }
}
