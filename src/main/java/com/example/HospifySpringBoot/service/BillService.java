package com.example.HospifySpringBoot.service;

import com.example.HospifySpringBoot.models.Bill;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {

    public List<Bill> getAllBills() {
        try{
            System.out.println("into service layer");
            return null;
        } catch(Exception e) {
            System.out.println("Error Message " + e.getMessage());
            return null;
        }
    }

    public Bill getPatientById(Long id) {
        try {
            return null;
        } catch (Exception e) {
            System.out.println("Error Message " + e.getMessage());
            return null;
        }
    }

    public Bill createBill(Bill bill) {
        try {
            return null;
        } catch(Exception e) {
            System.out.println("Error Message" + e.getMessage());
            return null;
        }
    }

    public void deleteBill(Long id) {
        try {

        } catch(Exception e) {
            System.out.println("Error Message" + e.getMessage());

        }
    }

    public Bill updateBill(Long id, Bill bill) {
        try {
            return null;
        } catch(Exception e) {
            System.out.println("Error Message" + e.getMessage());
            return null;
        }
    }
}
