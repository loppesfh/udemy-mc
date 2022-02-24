package com.udemy.mc.domain.entity;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PaymentBill extends Payment {
	private static final long serialVersionUID = 1L;
	
//	@JsonFormat(pattern = "dd/MM/yyyy hh:mm")
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant dueDate;
	
//	@JsonFormat(pattern = "dd/MM/yyyy hh:mm")
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant payDate;

//	public PaymentBill(Long id, Integer paymentStatus) {
//		super(id, paymentStatus);
//	}
//
//	public PaymentBill(Long id, PaymentStatus paymentStatus, Instant dueDate,
//			Instant payDate) {
//		super(id, paymentStatus);
//		this.dueDate = dueDate;
//		this.payDate = payDate;
//	}
//
//	public Instant getDueDate() {
//		return dueDate;
//	}
//
//	public void setDueDate(Instant dueDate) {
//		this.dueDate = dueDate;
//	}
//
//	public Instant getPayDate() {
//		return payDate;
//	}
//
//	public void setPayDate(Instant payDate) {
//		this.payDate = payDate;
//	}

}
