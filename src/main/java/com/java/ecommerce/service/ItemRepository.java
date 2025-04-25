package com.java.ecommerce.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.ecommerce.dto.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
