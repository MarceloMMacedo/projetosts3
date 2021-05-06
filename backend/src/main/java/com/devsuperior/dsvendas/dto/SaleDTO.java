package com.devsuperior.dsvendas.dto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.devsuperior.dsvendas.entity.Sale;
import com.devsuperior.dsvendas.entity.Seller;

import lombok.Data;
import lombok.NoArgsConstructor;
 
@Data
@NoArgsConstructor 
public class SaleDTO implements Serializable {
	private static final long serialVersionUID = 1L; 
	private Long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date; 
	private Seller seller;
	public SaleDTO(Long id, Integer visited, Integer deals, Double amount, LocalDate date, Seller seller) {
		super();
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.seller = seller;
	}
	
	public SaleDTO(Sale  sele) {
		super();
		this.id = sele.getId();
		this.visited = sele.getVisited();
		this.deals = sele.getDeals();
		this.amount = sele.getAmount();
		this.date = sele.getDate();
		this.seller = sele.getSeller();
	}
	
}
