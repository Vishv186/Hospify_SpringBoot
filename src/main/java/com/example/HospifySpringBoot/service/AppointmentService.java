package com.example.HospifySpringBoot.service;

import com.example.HospifySpringBoot.models.Appointment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    public List<Appointment> getAllAppointments() {
        try{
            System.out.println("into service layer");
            return null;
        } catch(Exception e) {
            System.out.println("Error Message " + e.getMessage());
            return null;
        }
    }

    public Appointment getAppointmentById(Long id) {
        try {
            return null;
        } catch (Exception e) {
            System.out.println("Error Message " + e.getMessage());
            return null;
        }
    }

    public Appointment createAppointment(Appointment appointment) {
        try {
            return null;
        } catch(Exception e) {
            System.out.println("Error Message" + e.getMessage());
            return null;
        }
    }

    public void deleteAppointment(Long id) {
        try {

        } catch(Exception e) {
            System.out.println("Error Message" + e.getMessage());

        }
    }

    public Appointment updateAppointment(Long id, Appointment appointment) {
        try {
            return null;
        } catch(Exception e) {
            System.out.println("Error Message" + e.getMessage());
            return null;
        }
    }
}
