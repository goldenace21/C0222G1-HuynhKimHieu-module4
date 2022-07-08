package com.example.case_study.repository.facility;

import com.example.case_study.model.facility.Facility;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacilityRepository extends JpaRepository<Facility, Integer> {
}
