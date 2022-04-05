package com.api.dao;

import org.springframework.data.repository.CrudRepository;

import com.api.entities.Seller;

public interface SellerRepository extends CrudRepository<Seller, Integer>{

	public Seller findById(int id);
}
