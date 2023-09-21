package com.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Project.model.Transaction;

public interface TransactionRepo extends JpaRepository<Transaction, Integer> {

}
