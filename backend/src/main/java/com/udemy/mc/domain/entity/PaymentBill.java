package com.udemy.mc.domain.entity;

import java.time.Instant;

public class PaymentBill extends Payment {
	private static final long serialVersionUID = 1L;
	
	private Instant dueDate;
	private Instant payDate;

	public PaymentBill(Long id, Integer paymentStatus) {
		super(id, paymentStatus);
	}

	public PaymentBill(Long id, com.udemy.mc.domain.entity.enums.PaymentStatus paymentStatus, Instant dueDate,
			Instant payDate) {
		super(id, paymentStatus);
		this.dueDate = dueDate;
		this.payDate = payDate;
	}

	public Instant getDueDate() {
		return dueDate;
	}

	public void setDueDate(Instant dueDate) {
		this.dueDate = dueDate;
	}

	public Instant getPayDate() {
		return payDate;
	}

	public void setPayDate(Instant payDate) {
		this.payDate = payDate;
	}

}
