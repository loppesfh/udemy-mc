package com.udemy.mc.domain.entity;

import java.time.Instant;

import javax.persistence.Entity;

import com.udemy.mc.domain.entity.enums.PaymentStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PaymentCard extends Payment {
	private static final long serialVersionUID = 1L;
	
	private Integer installments;
	
//	public PaymentCard(Long id, Integer paymentStatus) {
//		super(id, paymentStatus);
//		// TODO Auto-generated constructor stub
//	}
//
//	public PaymentCard(Long id, PaymentStatus paymentStatus, Integer installments) {
//		super(id, paymentStatus);
//		this.installments = installments;
//	}
//
//	public Integer getInstallments() {
//		return installments;
//	}
//
//	public void setInstallments(Integer installments) {
//		this.installments = installments;
//	}

}
