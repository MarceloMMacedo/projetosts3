package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entity.Seller;

import lombok.Data;
@Data
public class SellerDTO implements Serializable {
	private static final long serialVersionUID = 1L;
 
	private Long id;
	private String name;
	public SellerDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public SellerDTO(Seller obj) {
		super();
		this.id = obj.getId();
		this.name = obj.getName();
	}
	

}
