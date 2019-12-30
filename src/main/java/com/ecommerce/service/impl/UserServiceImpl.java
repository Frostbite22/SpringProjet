package com.ecommerce.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.entities.User;
import com.ecommerce.entities.security.PasswordResetToken;
import com.ecommerce.entities.security.UserRole;
import com.ecommerce.repository.PasswordResetTokenRepository;
import com.ecommerce.repository.RoleRepository;
import com.ecommerce.repository.UserRepository;
import com.ecommerce.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	private PasswordResetTokenRepository passwordResetTokenRepository ; 
	
	@Autowired
	private UserRepository userRepository ; 
	
	@Autowired 
	private RoleRepository roleRepository ; 
	
	@Override 
	public PasswordResetToken getPasswordResetToken(final String token)
	{
		return passwordResetTokenRepository.findByToken(token) ; 
	}
	@Override
	public void createPasswordResetTokenForUser(final User user,final String token)
	{
		final PasswordResetToken myToken = new PasswordResetToken(token,user);
		passwordResetTokenRepository.save(myToken); 
	}
	
	@Override 
	public User findByUsername(String username) {
		return userRepository.findByUsername(username) ; 
	}
	
	@Override 
	public User findByEmail(String email)
	{
		return userRepository.findByEmail(email) ; 
	}
	
	@Override 
	 public User createUser (User user, Set<UserRole> userRoles) throws Exception 
	{
		User localUser = userRepository.findByUsername(user.getUsername()) ; 
		if(localUser!=null)
		{
			//throw new Exception("user Already Exists."); 
		}else {
			for (UserRole ur : userRoles) {
				roleRepository.save(ur.getRole()); 
			}
		}
		user.getUserRoles().addAll(userRoles) ; 
		
		localUser = userRepository.save(user) ; 
		return localUser ; 
	}
	
	@Override 
	public User save(User user)
	{
		return userRepository.save(user) ; 
	}
}
