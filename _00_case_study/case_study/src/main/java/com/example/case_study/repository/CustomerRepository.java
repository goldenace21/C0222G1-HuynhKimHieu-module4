package com.example.case_study.repository;

import com.example.case_study.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Modifying
    @Query(value = "update customer set delete_status = 1 where idAuto = :idAuto", nativeQuery = true)
    void deleteById(@Param("idAuto") Integer idAuto);

    @Query(value = "select * from customer where delete_status = 0 and name like %:name%", nativeQuery = true)
    Page<Customer> findAll(Pageable pageable, @Param("name") String name);

    Page<Customer> findAllByNameContaining(Pageable pageable,String name);
}
