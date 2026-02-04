package com.example.HospifySpringBoot.repository;

import com.example.HospifySpringBoot.models.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.HospifySpringBoot.models.Bill;

public interface BillRepository<Bill> extends JpaRepository<Bill, Long> {

}
