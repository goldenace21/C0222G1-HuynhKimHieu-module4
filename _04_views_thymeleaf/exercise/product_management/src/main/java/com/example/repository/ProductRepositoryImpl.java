package com.example.repository;

import com.example.model.Product;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product("1", "iphone 10", "99.999", "new", "apple"));
        products.add(new Product("2", "Mi note 5", "19.999", "like new", "xiaomi"));
        products.add(new Product("3", "oppo reno", "88.999", "new", "oppo"));
        products.add(new Product("4", "pixel", "69.999", "old", "google"));
    }

    @Override
    public List<Product> products() {
        return products;
    }

    @Override
    public void addNew(Product product) {
        products.add(product);
    }

    @Override
    public void update(Product product) {
        for (Product item : products) {
            if (item.getId().equals(product.getId())) {
                item.setName(product.getName());
                item.setPrice(product.getPrice());
                item.setInfo(product.getInfo());
                item.setBrand(product.getBrand());
            }
        }
    }

    @Override
    public void delete(String id) {
        products.removeIf(item -> item.getId().equals(id));
    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product> productList = new ArrayList<>();
        for (Product item : products) {
            if (item.getName().contains(name)) {
                productList.add(item);
            }
        }
        return productList;
    }

    @Override
    public Product detail(String id) {
        for (Product item : products) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
}
