package com.java.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.ecommerce.dto.Seller;

public interface SellerRepository extends JpaRepository<Seller, Integer> {

	boolean existsByEmail(String email);
	boolean existsByMobile(long mobile);
	Seller findByEmail(String email);

}
