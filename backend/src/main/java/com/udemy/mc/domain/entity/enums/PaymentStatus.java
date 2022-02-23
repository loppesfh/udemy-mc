package com.udemy.mc.domain.entity.enums;

public enum PaymentStatus {
	
	PENDING(1, "Pendente"),
	PAID(2, "Pago"),
	CANCELED(3, "Cancelado");
	
	private Integer id;
	private String description;
	
	private PaymentStatus(Integer id, String description) {
		this.id = id;
		this.description = description;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public static PaymentStatus toEnum(Integer id) {		
		if ( id == null) {
			return null;
		}		
		for (PaymentStatus ps: PaymentStatus.values()) {
			if (id.equals(ps.getId())) {
				return ps;
			}
		}
		throw new IllegalArgumentException("Id inválido: " + id);
	}	
}