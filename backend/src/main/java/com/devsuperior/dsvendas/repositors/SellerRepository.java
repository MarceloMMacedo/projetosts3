package com.devsuperior.dsvendas.repositors;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsvendas.entity.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {

}
