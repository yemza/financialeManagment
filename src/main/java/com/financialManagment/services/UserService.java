package com.financialManagment.services;


import java.util.List;

import com.financialManagment.entityJPA.UserEntity;


public interface UserService {
	
     List<UserEntity> getAllUsers();

     UserEntity login(String email , String password);

}
