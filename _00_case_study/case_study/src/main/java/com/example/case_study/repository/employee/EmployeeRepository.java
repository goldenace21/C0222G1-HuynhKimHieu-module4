package com.example.case_study.repository.employee;

import com.example.case_study.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    @Query(value = "select * from employee where delete_status = 0 and name like %:name%",nativeQuery = true)
    Page<Employee> findAll(Pageable pageable, @Param("name") String name);

}
