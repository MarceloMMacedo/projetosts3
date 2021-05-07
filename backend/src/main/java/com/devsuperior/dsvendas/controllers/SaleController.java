package com.devsuperior.dsvendas.controllers;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.dto.SaleSuccessDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;
import com.devsuperior.dsvendas.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private SaleService service;

	// paginação
	@GetMapping
	@Transactional(readOnly = true)
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
		Page<SaleDTO> p = service.findAll(pageable);
		return ResponseEntity.ok().body(p);
	}

	@GetMapping(value = "/amount-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupBySeller() {
		List<SaleSumDTO> list=service.amountGroupBySeller();
		return ResponseEntity.ok().body(list);
		
	}
	@GetMapping(value = "/success-by-seller")
	public ResponseEntity<List<SaleSuccessDTO>> successGroupBySeller() {
		List<SaleSuccessDTO> list=service.successGroupBySeller();
		return ResponseEntity.ok().body(list);
		
	}
}
