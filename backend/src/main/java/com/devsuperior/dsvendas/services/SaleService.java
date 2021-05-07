package com.devsuperior.dsvendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.dto.SaleSuccessDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;
import com.devsuperior.dsvendas.repositors.SaleRepository;

@Service
public class SaleService {

	@Autowired
	SaleRepository repo;

	public Page<SaleDTO> findAll(Pageable pageable) {
		return repo.findAll(pageable).map(x -> new SaleDTO(x));
	}

	public List<SaleSumDTO> amountGroupBySeller() {
		return repo.amountGroupBySeller();
	}

	public List<SaleSuccessDTO> successGroupBySeller() {
		return repo.successGroupBySeller();
	}
}
