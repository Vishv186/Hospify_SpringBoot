package com.example.HospifySpringBoot.service;

import com.example.HospifySpringBoot.models.Doctor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    private static final Logger logger = LoggerFactory.getLogger(PatientService.class);

    public List<Doctor> getAllDoctors() {
        try{
            System.out.println("into service layer");
            return null;
        } catch(Exception e) {
            System.out.println("Error Message " + e.getMessage());
            logger.error("An error occured while fetching all doctors: {}", e.getMessage());
            return null;
        }
    }

    public Doctor getDoctorById(Long id) {
        try {
            return null;
        } catch (Exception e) {
            System.out.println("Error Message " + e.getMessage());
            logger.error("An error occured while fetching doctor with Id {} : {}", id, e.getMessage());
            return null;
        }
    }

    public Doctor createDoctor(Doctor doctor) {
        try {
            return null;
        } catch(Exception e) {
            System.out.println("Error Message" + e.getMessage());
            logger.error("An error occured while creating doctor: {}", e.getMessage());
            return null;
        }
    }

    public void deleteDoctor(Long id) {
        try {

        } catch(Exception e) {
            System.out.println("Error Message" + e.getMessage());
            logger.error("An error occured while deleting doctor with Id {} : {}", id, e.getMessage());
        }
    }

    public Doctor updateDoctor(Long id, Doctor doctor) {
        try {
            return null;
        } catch(Exception e) {
            System.out.println("Error Message" + e.getMessage());
            logger.error("An error occured while updating doctor with Id {} : {}", id, e.getMessage());
            return null;
        }
    }
}
