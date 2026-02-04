package com.example.HospifySpringBoot.service;

import com.example.HospifySpringBoot.models.Appointment;
import com.example.HospifySpringBoot.repository.AppointmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {

    private static final Logger logger = LoggerFactory.getLogger(AppointmentService.class);
    @Autowired
    private AppointmentRepository appointmentRepository;

    public List<Appointment> getAllAppointments() {
        try{
            System.out.println("into service layer");
            return appointmentRepository.findAll();
        } catch(Exception e) {
            System.out.println("Error Message " + e.getMessage());
            logger.error("An error occured while fetching all Appointments: {}", e.getMessage());
            return null;
        }
    }

    public Appointment getAppointmentById(Long id) {
        try {
            Optional<Appointment> appointment = appointmentRepository.findById(id);
            return appointment.orElse(null);
        } catch (Exception e) {
            System.out.println("Error Message " + e.getMessage());
            logger.error("An error occured while fetching Appointment with Id {} : {}", id, e.getMessage());
            return null;
        }
    }

    public Appointment createAppointment(Appointment appointment) {
        try {
            appointmentRepository.save(appointment);
            return appointment;
        } catch(Exception e) {
            System.out.println("Error Message" + e.getMessage());
            logger.error("An error occured while creating Appointment: {}", e.getMessage());
            return null;
        }
    }

    public void deleteAppointment(Long id) {
        try {
            logger.info("Deleting appointment with id : {}", id);
            appointmentRepository.deleteById(id);
        } catch(Exception e) {
            System.out.println("Error Message" + e.getMessage());
            logger.error("An error occured while deleting appointment with Id {} : {}", id, e.getMessage());
        }
    }

    public Appointment updateAppointment(Long id, Appointment appointment) {
        try {
            Optional<Appointment> existingAppointment = appointmentRepository.findById(id);
            if(existingAppointment.isPresent()){
                Appointment a = existingAppointment.get();
                a.setPatientId(appointment.getPatientId());
                a.setDoctorId(appointment.getDoctorId());
                a.setDate(appointment.getDate());

                return appointmentRepository.save(a);
            } else {
                logger.error("Appointment with Id {} not found", id);
                return null;
            }
        } catch(Exception e) {
            System.out.println("Error Message" + e.getMessage());
            logger.error("An error occured while updating appointment with Id {} : {}", id, e.getMessage());
            return null;
        }
    }
}

