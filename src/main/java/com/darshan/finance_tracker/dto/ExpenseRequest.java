package com.darshan.finance_tracker.dto;

import java.time.LocalDate;

public class ExpenseRequest {

	public ExpenseRequest() {
		
	}
	
	private Double amount;

	private String description;
	
	private LocalDate expenseDate;
	
	private Category category;
	
	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getExpenseDate() {
		return expenseDate;
	}

	public void setExpenseDate(LocalDate expenseDate) {
		this.expenseDate = expenseDate;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	
}
