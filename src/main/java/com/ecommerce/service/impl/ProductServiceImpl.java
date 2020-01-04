package com.ecommerce.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.entities.Product;
import com.ecommerce.repository.ProductRepository;
import com.ecommerce.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired 
	ProductRepository productRepository ; 
	  @Override 
	  public List<Product> findAll()
	  {
		  return productRepository.findAll() ; 
	  }
	  
	  @Override 
	  public Optional<Product> findById(Long id){
		  return productRepository.findById(id) ; 
	  }
	
}
