package com.ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.ecommerce.entities.Product;

public interface ProductService {
	List<Product> findAll() ;
	
	Optional<Product> findById(Long id);
}
