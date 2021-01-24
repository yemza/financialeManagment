package com.financialManagment.entityJPA;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="spend_type")
public class SpendTypeEntity implements Serializable{
	
	
	@Id
	@SequenceGenerator(name = "SEQ_GEN", sequenceName = "SEQ_USER", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_GEN")
	private Long idSpendType;
	private String entitled;
	
	public SpendTypeEntity() {
		// TODO Auto-generated constructor stub
	}
	
	public SpendTypeEntity(Long idSpendType, String entitled) {
		super();
		this.idSpendType = idSpendType;
		this.entitled = entitled;
	}

	public Long getIdSpendType() {
		return idSpendType;
	}

	public void setIdSpendType(Long idSpendType) {
		this.idSpendType = idSpendType;
	}

	public String getEntitled() {
		return entitled;
	}

	public void setEntitled(String entitled) {
		this.entitled = entitled;
	}
	
	

}
