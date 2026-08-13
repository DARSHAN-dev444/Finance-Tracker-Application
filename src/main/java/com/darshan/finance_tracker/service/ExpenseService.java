package com.darshan.finance_tracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darshan.finance_tracker.dto.ExpenseRequest;
import com.darshan.finance_tracker.entity.Expense;
import com.darshan.finance_tracker.repository.ExpenseRepository;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public String addExpense(
            ExpenseRequest request) {

        Expense expense = new Expense();

        expense.setAmount(
                request.getAmount());

        expense.setDescription(
                request.getDescription());

        expense.setExpenseDate(
                request.getExpenseDate());

        expense.setCategory(
                request.getCategory());

        expenseRepository.save(expense);

        return "Expense Added Successfully";
    }
}