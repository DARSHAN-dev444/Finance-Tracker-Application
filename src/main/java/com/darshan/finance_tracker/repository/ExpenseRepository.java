package com.darshan.finance_tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.darshan.finance_tracker.entity.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long>{

}
