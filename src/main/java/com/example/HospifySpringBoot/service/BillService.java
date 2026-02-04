package com.example.HospifySpringBoot.service;

import com.example.HospifySpringBoot.models.Bill;
import com.example.HospifySpringBoot.repository.BillRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BillService {

    private static final Logger logger = LoggerFactory.getLogger(BillService.class);

    @Autowired
    private BillRepository billRepository;

    public List<Bill> getAllBills() {
        try{
            System.out.println("into service layer");
            return billRepository.findAll();
        } catch(Exception e) {
            System.out.println("Error Message " + e.getMessage());
            logger.error("An error occured while fetching all bills: {}", e.getMessage());
            return null;
        }
    }

    public Bill getBillById(Long id) {
        try {
            Optional<Bill> bill = billRepository.findById(id);
            return bill.orElse(null);
        } catch (Exception e) {
            System.out.println("Error Message " + e.getMessage());
            logger.error("An error occured while fetching bill with Id {} : {}", id, e.getMessage());
            return null;
        }
    }

    public Bill createBill(Bill bill) {
        try {
            billRepository.save(bill);
            return bill;
        } catch(Exception e) {
            System.out.println("Error Message" + e.getMessage());
            logger.error("An error occured while creating bill: {}", e.getMessage());
            return null;
        }
    }

    public void deleteBill(Long id) {
        try {
            logger.info("Deleting bill with id : {}", id);
            billRepository.deleteById(id);
        } catch(Exception e) {
            System.out.println("Error Message" + e.getMessage());
            logger.error("An error occured while deleting bill with Id {} : {}", id, e.getMessage());
        }
    }

    public Bill updateBill(Long id, Bill bill) {
        try {
            Optional<Bill> existingBill = billRepository.findById(id);
            if(existingBill.isPresent()){
                Bill b = existingBill.get();
                b.setPatientId(bill.getPatientId());
                b.setStatus(bill.getStatus());

                return billRepository.save(b);
            } else {
                logger.error("Bill with Id {} not found", id);
                return null;
            }
        } catch(Exception e) {
            System.out.println("Error Message" + e.getMessage());
            logger.error("An error occured while updating bill with Id {} : {}", id, e.getMessage());
            return null;
        }
    }
}
