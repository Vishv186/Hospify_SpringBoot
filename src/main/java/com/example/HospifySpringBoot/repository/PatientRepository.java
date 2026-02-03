package com.example.HospifySpringBoot.repository;

import com.example.HospifySpringBoot.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.HospifySpringBoot.models.Patient;

public interface PatientRepository<Patient> extends JpaRepository<Patient, Long> {

}
