package com.customerapp.model.persistance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "customer_tablenew")
public class Customer {
	@Id
	@GeneratedValue
    private int id;
	
	@NotEmpty(message="name cant left blank")
    private String name;
	
	@Email
	@NotEmpty(message="email cant left blank")
    private String email;
	
	@NotEmpty(message="address cant left blank")
    private String address;
	
	@NotEmpty(message="phoneno cant left blank")
	private String phoneno;
	
	@NotNull(message="price can not be null")
    private Double salary;
	
	public Customer(String name, String email, String address, String phoneno, Double salary) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.phoneno = phoneno;
		this.salary = salary;
	}

	public Customer(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	
    
    
}
