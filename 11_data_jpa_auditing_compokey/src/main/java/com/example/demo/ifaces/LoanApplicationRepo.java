package com.example.demo.ifaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Inventory;
import com.example.demo.entity.LoanApplication;
import com.example.demo.model.Composed;


public interface LoanApplicationRepo extends JpaRepository<LoanApplication, String> {

}
