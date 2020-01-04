package com.ecommerce.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	
	List<Product> findAll() ; 
	Optional<Product> findById(Long id);
}
