package com.udemy.mc.domain.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.udemy.mc.domain.entity.enums.PaymentStatus;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "payment")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Payment implements Serializable{
	private static final long serialVersionUID = 1L;

	@EqualsAndHashCode.Include
	@Id
	private Long id;
	
	private Integer paymentStatus;
	
	@OneToOne
	@JoinColumn(name = "order_id")
	@MapsId
	private Order order;

	
	public Payment(Long id, PaymentStatus paymentStatus, Order order) {
		super();
		this.id = id;
		this.paymentStatus = paymentStatus.getId();
		this.order = order;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PaymentStatus getPaymentStatus() {
		return PaymentStatus.toEnum(paymentStatus);
				
	}

	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus.getId();
	}	
}
