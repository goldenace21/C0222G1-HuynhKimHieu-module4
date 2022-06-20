package com.example.repository;

import com.example.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductReposioryImpl implements ProductRepository{
    @Override
    public List<Product> products() {
        return BaseRepository.entityManager.createQuery("select p from product p",Product.class).getResultList();
    }

    @Override
    public void addNew(Product product) {

    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public List<Product> searchByName(String name) {
        return null;
    }

    @Override
    public Product detail(String id) {
        return null;
    }
}
