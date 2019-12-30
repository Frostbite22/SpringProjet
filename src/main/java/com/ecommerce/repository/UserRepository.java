package com.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {
		
	User findByUsername(String username); 
	
	User findByEmail(String email) ; 
	
	User save(User user); 
}
