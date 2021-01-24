package com.financialManagment.entityJPA;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class UserEntity implements Serializable{

		@Id
		@SequenceGenerator(name = "SEQ_GEN", sequenceName = "SEQ_USER", allocationSize = 1)
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_GEN")
	   private Long id;
	   
	   private String firstName;
	   private String lastName;
	   
	   @Column(unique = true)
	   private String email;
	   private String password;
	   private Double salary;
	   
	   @OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
	   private Set<SpendEntity> sepnds;
	   
	   
	   public UserEntity() {
		// TODO Auto-generated constructor stub
	}
	   
	public UserEntity(Long id,String firstName, String lastName, String email,
			String password, Double salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.salary = salary;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	   
	   
	
	
}
