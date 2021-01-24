package com.financialManagment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financialManagment.entityJPA.SpendTypeEntity;
import com.financialManagment.repository.SpendTypeRepository;

@Service
public class SpendTypeServiceImpl implements SpendTypeService {

	@Autowired
	private SpendTypeRepository spendTypeRepository;
	
	@Override
	public List<SpendTypeEntity> getSpendType() {
		return spendTypeRepository.findAll();
	}

	
   

}
