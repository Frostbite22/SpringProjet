package com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceApplication /*implements CommandLineRunner*/{

	/*@Autowired 
	private UserService userService ;*/

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
		
	}
	
	/*@Override 
	public void run(String...args) throws Exception 
	{
		User user1 = new User() ; 
		user1.setFirstName("feres");
		user1.setLastName("landoulsi");
		user1.setUsername("mdferes") ; 
		user1.setPassword(SecurityUtility.passwordEncoder().encode("feres"));
		user1.setEmail("landoulsiferes@outlook.com");
		Set<UserRole> userRoles = new HashSet<>();
		Role role1 = new Role(); 
		role1.setRoleId(1); 
		role1.setName("ROLE_USER");
		userRoles.add(new UserRole(user1,role1));
		userService.createUser(user1,userRoles); 
	}*/

}
