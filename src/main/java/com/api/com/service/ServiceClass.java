package com.api.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.dao.SellerRepository;
import com.api.entities.Customer;
import com.api.entities.Seller;

@Component
public class ServiceClass {
	
	@Autowired
	private static SellerRepository sellerRepository;

	public static Seller createSellData(Seller seller) {

		return sellerRepository.save(seller);
		
	}

	public Seller getSellData(int id) {
		// TODO Auto-generated method stub
		return sellerRepository.findById(id);
	}

	public List<Seller> getAllSellsData() {
		// TODO Auto-generated method stub
		return (List<Seller>) sellerRepository.findAll();
		}

	public void updateSellData(int sid, Seller seller) {
	
		sellerRepository.deleteById(sid);
		seller.setId(sid);
		sellerRepository.save(seller);
		
	}

	public Customer updateCustomerData(int id, Customer customer, Seller seller) {
	  
		customer.setCustomerId(id);
		seller.setCustomer(customer);
		sellerRepository.save(seller);
		return customer;
     }

}
