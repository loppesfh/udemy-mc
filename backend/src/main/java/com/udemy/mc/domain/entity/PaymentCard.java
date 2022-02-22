package com.udemy.mc.domain.entity;

public class PaymentCard extends Payment {
	private static final long serialVersionUID = 1L;
	
	private Integer installments;
	
	public PaymentCard(Long id, Integer paymentStatus) {
		super(id, paymentStatus);
		// TODO Auto-generated constructor stub
	}

	public PaymentCard(Long id, com.udemy.mc.domain.entity.enums.PaymentStatus paymentStatus, Integer installments) {
		super(id, paymentStatus);
		this.installments = installments;
	}

	public Integer getInstallments() {
		return installments;
	}

	public void setInstallments(Integer installments) {
		this.installments = installments;
	}

}
