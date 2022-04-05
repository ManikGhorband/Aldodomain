package com.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.com.service.ServiceClass;
import com.api.entities.Customer;
import com.api.entities.Seller;

@RestController
public class Sellercontroller {

	
	@Autowired
	private ServiceClass serviceClass;

	@PostMapping("/seller")
	public ResponseEntity<Seller> createSell(@RequestBody Seller seller) {
		try {
			Seller sell = ServiceClass.createSellData(seller);
			return ResponseEntity.of(Optional.of(sell));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@GetMapping("/seller/{id}")
	public ResponseEntity<Seller> getSell(@PathVariable("id") int id) {
		try {
			Seller sell = serviceClass.getSellData(id);
			return ResponseEntity.of(Optional.of(sell));

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

		}
	}

	@GetMapping("/seller")
	public ResponseEntity<List<Seller>> getAllSells() {
		try {
			List<Seller> sells = serviceClass.getAllSellsData();
			return ResponseEntity.of(Optional.of(sells));

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

		}
	}

	@PutMapping("/seller/{id}")
	public ResponseEntity<Object> updateSell(@PathVariable("id") int id, @RequestBody Seller seller) {
		try {
			serviceClass.updateSellData(id, seller);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@PutMapping("/seller/{id}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable("id")int id,@RequestBody Customer customer,@RequestBody Seller seller) {
		try {
			Customer c=serviceClass.updateCustomerData(id,customer,seller);
			return ResponseEntity.of(Optional.of(customer));

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

		}
		
	}
}

	
	

