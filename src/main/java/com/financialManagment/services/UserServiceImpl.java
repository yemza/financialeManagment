package com.financialManagment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financialManagment.entityJPA.UserEntity;
import com.financialManagment.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {

 @Autowired
  private UserRepository userRepository;
		
   @Override
	public List<UserEntity> getAllUsers() {
		return userRepository.findAll();
	}

   
	@Override
	public UserEntity login(String email, String password) {
		UserEntity user = userRepository.findByemail(email);
		
		if(user != null) {
			if(user.getPassword().equals(password)) {
				return user;
				
			}else {
				user = null;
			}
		
		}
		return user;
	}

}
