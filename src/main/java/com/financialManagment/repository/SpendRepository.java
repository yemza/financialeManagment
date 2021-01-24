package com.financialManagment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.financialManagment.entityJPA.SpendEntity;

@Repository
public interface SpendRepository extends JpaRepository<SpendEntity , Long>{

	List<SpendEntity> findByUserId(long id);
}