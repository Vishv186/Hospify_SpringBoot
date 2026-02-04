package com.example.HospifySpringBoot.repository;

import com.example.HospifySpringBoot.models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.HospifySpringBoot.models.Appointment;

public interface AppointmentRepository<Appointment> extends JpaRepository<Appointment, Long> {

}
