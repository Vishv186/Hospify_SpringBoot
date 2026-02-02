package com.example.HospifySpringBoot.controllers;

import com.example.HospifySpringBoot.models.Doctor;
import com.example.HospifySpringBoot.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/v1/doctors")

public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping
    public List<Doctor> getAllDoctor() {
        System.out.println("Fetching all Doctor");
        return doctorService.getAllDoctors();
    }

    @PostMapping
    public Doctor createDoctor(@RequestBody Doctor doctor) {
        System.out.println("Creating doctor");
        return doctorService.createDoctor(doctor);
    }

    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable Long id) {
        System.out.println("Fetching Doctor by ID");
        return doctorService.getDoctorById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable Long id) {
        doctorService.deleteDoctor(id);
    }

    @PutMapping("/{id}")
    public void updateDoctor(@PathVariable Long id, Doctor doctor) {
        doctorService.updateDoctor(id, doctor);
    }
}
