package com.financialManagment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financialManagment.entityJPA.SpendEntity;
import com.financialManagment.repository.SpendRepository;

@Service
public class SpendServiceImpl implements SpendService {
	
	
	@Autowired
	private SpendRepository spendRepository;
	

	@Override
	public List<SpendEntity> getUserSpends(Long id) {
		return spendRepository.findByUserId(id);
	}

}
