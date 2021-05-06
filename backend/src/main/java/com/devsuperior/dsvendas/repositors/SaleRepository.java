package com.devsuperior.dsvendas.repositors;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsvendas.entity.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

}
