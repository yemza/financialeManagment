package com.financialManagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.financialManagment.entityJPA.SpendTypeEntity;


@Repository
public interface SpendTypeRepository extends JpaRepository<SpendTypeEntity ,Long> {

}
