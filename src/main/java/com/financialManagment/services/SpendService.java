package com.financialManagment.services;

import java.util.List;

import com.financialManagment.entityJPA.SpendEntity;

public interface SpendService {

	List<SpendEntity> getUserSpends(Long id);

}
