package com.udemy.mc.domain.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.udemy.mc.domain.entity.enums.PaymentStatus;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "payment")
public abstract class Payment implements Serializable{
	private static final long serialVersionUID = 1L;

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer PaymentStatus;

	public Payment(Long id, Integer paymentStatus) {
		super();
		this.id = id;
		PaymentStatus = paymentStatus;
	}
	
	public Payment(Long id, PaymentStatus paymentStatus) {
		super();
		this.id = id;
		PaymentStatus = paymentStatus.getId();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getPaymentStatus() {
		return PaymentStatus;
	}

	public void setPaymentStatus(Integer paymentStatus) {
		PaymentStatus = paymentStatus;
	}	
}
