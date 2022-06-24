package com.example.product.repository;

import com.example.product.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ProductRepository  extends JpaRepository<Product, Integer> {
    @Modifying
    @Query(value = "update product set status_delete = 1 where id = :id", nativeQuery = true)
    void deleteById(@Param("id") Integer id);

    @Query(value = "select * from product where status_delete = 0 and name like %:name%", nativeQuery = true)
    Page<Product> findAll(Pageable pageable,@Param("name") String name);
}
