package com.darshan.finance_tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.darshan.finance_tracker.dto.ExpenseRequest;
import com.darshan.finance_tracker.service.ExpenseService;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @PostMapping
    public String addExpense(
            @RequestBody ExpenseRequest request) {

        return expenseService.addExpense(request);
    }
}