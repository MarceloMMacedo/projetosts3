package com.devsuperior.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.repositors.SaleRepository;

@Service
public class SaleService {

	@Autowired
	SaleRepository repo;

	@GetMapping
	public Page<SaleDTO> findAll(Pageable pageable) {
		return repo.findAll(pageable).map(x -> new SaleDTO(x));
	}
}
