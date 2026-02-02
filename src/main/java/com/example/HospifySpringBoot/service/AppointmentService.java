package com.example.HospifySpringBoot.service;

import com.example.HospifySpringBoot.models.Appointment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    private static final Logger logger = LoggerFactory.getLogger(PatientService.class);

    public List<Appointment> getAllAppointments() {
        try{
            System.out.println("into service layer");
            return null;
        } catch(Exception e) {
            System.out.println("Error Message " + e.getMessage());
            logger.error("An error occured while fetching all Appointments: {}", e.getMessage());
            return null;
        }
    }

    public Appointment getAppointmentById(Long id) {
        try {
            return null;
        } catch (Exception e) {
            System.out.println("Error Message " + e.getMessage());
            logger.error("An error occured while fetching Appointment with Id {} : {}", id, e.getMessage());
            return null;
        }
    }

    public Appointment createAppointment(Appointment appointment) {
        try {
            return null;
        } catch(Exception e) {
            System.out.println("Error Message" + e.getMessage());
            logger.error("An error occured while creating Appointment: {}", e.getMessage());
            return null;
        }
    }

    public void deleteAppointment(Long id) {
        try {

        } catch(Exception e) {
            System.out.println("Error Message" + e.getMessage());
            logger.error("An error occured while deleting appointment with Id {} : {}", id, e.getMessage());
        }
    }

    public Appointment updateAppointment(Long id, Appointment appointment) {
        try {
            return null;
        } catch(Exception e) {
            System.out.println("Error Message" + e.getMessage());
            logger.error("An error occured while updating appointment with Id {} : {}", id, e.getMessage());
            return null;
        }
    }
}

