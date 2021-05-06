package com.devsuperior.dsvendas.services;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.entity.Seller;
import com.devsuperior.dsvendas.repositors.SellerRepository;

@Service
public class SellerService {

	@Autowired
	SellerRepository repo;

	public List<SellerDTO> findAll() {
		return repo.findAll().stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
}
