package com.example.HospifySpringBoot.service;

import com.example.HospifySpringBoot.models.Patient;
import java.util.List;

public class PatientService {

    public List<Patient> getAllPatients() {
        try{
            System.out.println("into service layer");
            return null;
        } catch(Exception e) {
            System.out.println("Error Message " + e.getMessage());
            return null;
        }
    }

    public Patient getPatientById(Long id) {

    }
}
