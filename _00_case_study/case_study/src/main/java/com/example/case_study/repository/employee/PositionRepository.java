package com.example.case_study.repository.employee;

import com.example.case_study.model.employee.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface PositionRepository extends JpaRepository<Position, Integer> {
}
