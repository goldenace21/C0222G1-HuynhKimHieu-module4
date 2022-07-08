package com.example.case_study.service.employee;

import com.example.case_study.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmployeeService {
    Page<Employee> findAll(Pageable pageable, String name);

    Employee save(Employee employee);

    Employee findById(Integer id);
}
