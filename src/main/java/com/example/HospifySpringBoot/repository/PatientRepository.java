package com.example.HospifySpringBoot.repository;

import com.example.HospifySpringBoot.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}



