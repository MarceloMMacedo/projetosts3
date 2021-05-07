package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entity.Seller;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SaleSumDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String sellerName;
	private Double sum;

	public SaleSumDTO(Seller seller, double sum) {
		super();
		this.sellerName = seller.getName();
		this.sum = sum;
	}

}
