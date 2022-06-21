package com.example.repository;

import com.example.model.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import java.util.List;

@Repository
public class ProductReposioryImpl implements ProductRepository {
    @Override
    public List<Product> products() {
        return BaseRepository.entityManager.createQuery("select p from product p", Product.class).getResultList();
    }

    @Override
    public void addNew(Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(product);
        entityTransaction.commit();
    }

    @Override
    public void update(Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.merge(product);
        entityTransaction.commit();
    }

    @Override
    public void delete(Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.merge(product);
        entityTransaction.commit();
    }

    @Override
    public List<Product> searchByName(String name) {
        return BaseRepository.entityManager.createQuery("select p from product p where p.name like ?1", Product.class).setParameter(1, "%" + name + "%").getResultList();
    }

    @Override
    public Product detail(String id) {
        return BaseRepository.entityManager.createQuery("select p from product p where p.id = ?1", Product.class).setParameter(1, id).getSingleResult();

    }
}
