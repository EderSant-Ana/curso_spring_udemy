package com.santana.spring_udemy.domain.enums;

public enum OrderStatus {
	
	WAITING_PAYMENT(1, "Waiting payment"),
	PAID(2, "Paid"),
	SHIPPED(3, "Shipped"),
	DELIVERED(4, "Delivered"),
	CANCELED(5, "Canceled");

	private int code;
	private String descricao;

	private OrderStatus(int code, String descricao) {
		this.code = code;
		this.descricao = descricao;
	}

	public int getCode() {
		return code;
	}

	public String getDescricao() {
		return descricao;
	}

	public static OrderStatus toEnum(Integer code) {
		if(code == null) {
			return null;
		}
		for(OrderStatus x: OrderStatus.values()) {
			if(code.equals(x.getCode())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido: " + code);
	}
	
	

}
