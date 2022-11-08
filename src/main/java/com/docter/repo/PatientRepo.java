package com.docter.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docter.model.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Long> {

}
