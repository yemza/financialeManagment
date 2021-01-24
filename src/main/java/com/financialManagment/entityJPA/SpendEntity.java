package com.financialManagment.entityJPA;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Spend")
public class SpendEntity implements Serializable{
	
	@Id
	@SequenceGenerator(name = "SEQ_GEN", sequenceName = "SEQ_USER", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_GEN")
	private Long idSpend;
	
    @ManyToOne
    @JoinColumn(name="id_User")
	private UserEntity user;
	
	private Date date;
	
	@ManyToOne
	@JoinColumn(name = "id_Type" , nullable = false)
	private SpendTypeEntity spendType;
	private Double amount;
	
	public SpendEntity() {
		// TODO Auto-generated constructor stub
	}
	
	public SpendEntity(Long idSpend, UserEntity user, Date date, SpendTypeEntity spendType, Double amount) {
		super();
		this.idSpend = idSpend;
		this.user = user;
		this.date = date;
		this.spendType = spendType;
		this.amount = amount;
	}

	public Long getIdSpend() {
		return idSpend;
	}

	public void setIdSpend(Long idSpend) {
		this.idSpend = idSpend;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public SpendTypeEntity getSpendType() {
		return spendType;
	}

	public void setSpendType(SpendTypeEntity spendType) {
		this.spendType = spendType;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	
	
	
	

}
