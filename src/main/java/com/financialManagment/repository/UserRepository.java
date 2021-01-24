package com.financialManagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.financialManagment.entityJPA.UserEntity;


@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long>{

	UserEntity findByemail(String email);
	

}
