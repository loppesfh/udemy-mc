package com.udemy.mc.domain.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
//@Entity
//@Table(name = "order_item")
@Embeddable
public class OrderItemPK implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@EqualsAndHashCode.Include
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;
	
	@EqualsAndHashCode.Include
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;	

}
