package com.example.HospifySpringBoot.controllers;

import com.example.HospifySpringBoot.models.Bill;
import com.example.HospifySpringBoot.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/v1/bills")

public class BillController {

    @Autowired
    private BillService billService;


    @GetMapping
    public List<Bill> getAllBills() {
        System.out.println("Fetching the bills");
        return billService.getAllBills();
    }

    @PostMapping
    public Bill createBill(@RequestBody Bill bill) {
        System.out.println("Creating Bill");
        return  billService.createBill(bill);
    }

    @GetMapping("/{id}")
    public Bill getBillById(@PathVariable Long id) {
        System.out.println("Fetching Bill by ID");
        return billService.getBillById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBill(@PathVariable Long id) {
        billService.deleteBill(id);
    }

    @PutMapping("/{id}")
    public void updateBill(@PathVariable Long id,@RequestBody Bill bill) {
        billService.updateBill(id, bill);
    }
}
