package com.example.HospifySpringBoot.controllers;

import com.example.HospifySpringBoot.models.Doctor;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/v1/doctors")

public class DoctorController {

    @GetMapping
    public List<Doctor> getAllDoctor() {
        System.out.println("Fetching all Doctor");
        return null;
    }

    @PostMapping
    public Doctor createDoctor(@RequestBody Doctor doctor) {
        System.out.println("Creating doctor");
        return doctor;
    }

    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable Long id) {
        System.out.println("Fetching Doctor by ID");
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable Long id) {
        System.out.println("Deleting Doctor with id: " + id);
    }

    @PutMapping("/{id}")
    public void updateDoctor(@PathVariable Long id) {
        System.out.println("Updating doctor with ID: " + id);
    }
}
