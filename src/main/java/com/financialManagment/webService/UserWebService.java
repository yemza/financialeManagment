package com.financialManagment.webService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.financialManagment.entityJPA.SpendEntity;
import com.financialManagment.entityJPA.SpendTypeEntity;
import com.financialManagment.entityJPA.UserEntity;
import com.financialManagment.services.SpendService;
import com.financialManagment.services.SpendTypeService;
import com.financialManagment.services.UserService;

@RestController("/")
@CrossOrigin("*")
public class UserWebService {
	
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private SpendService spendService;
	
	@Autowired
	private SpendTypeService spendTypeService;
	
    @RequestMapping("")
	public String getAllUser() {
		return "Fuck you";
	}
	@GetMapping("/users")
	public List<UserEntity> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@PostMapping("/login")
	public UserEntity login( @RequestBody UserEntity user) {
		return userService.login(user.getEmail() , user.getPassword());
		  
	}
	
	@GetMapping("/spend")
	public List<SpendEntity> getUserSpends(Long id){
		return spendService.getUserSpends(id);
	}

	@GetMapping("/spendType")
	public List<SpendTypeEntity> getSpendType(){
		return spendTypeService.getSpendType();
	}


}
