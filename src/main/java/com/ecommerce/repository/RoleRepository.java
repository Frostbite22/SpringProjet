package com.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.entities.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long>{

	Role findByName(Role role); 
}
