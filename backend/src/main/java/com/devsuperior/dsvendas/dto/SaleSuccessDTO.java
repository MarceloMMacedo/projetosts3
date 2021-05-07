package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entity.Seller;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SaleSuccessDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String sellerName;
	private Long visited;
	private Long deals;
	public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
		super();
		this.sellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}
	

	 

}
