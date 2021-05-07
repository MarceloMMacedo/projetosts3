package com.devsuperior.dsvendas.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.devsuperior.dsvendas.entity.Sale;
import com.devsuperior.dsvendas.entity.Seller;

import lombok.Data;

@Data
public class SaleDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	private Seller seller;
	public SaleDTO( Sale sale) {
		super();
		this.id = sale.getId();
		this.visited = sale.getVisited();
		this.deals = sale.getDeals();
		this.amount = sale.getAmount();
		this.date = sale.getDate();
		this.seller = sale.getSeller();
	}

}
