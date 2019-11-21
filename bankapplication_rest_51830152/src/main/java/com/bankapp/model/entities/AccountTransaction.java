package com.bankapp.model.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "accounttransaction_tabled")
public class AccountTransaction {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private LocalDate txdate;
	private String type;
	private Double amount;
	
	@JoinColumn(name="accountNum_fk")
	@ManyToOne
	private Account account;

	public AccountTransaction( String type, double amount) {
		this.txdate = LocalDate.now();
		this.type = type;
		this.amount = amount;
	}

	public AccountTransaction() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getTxdate() {
		return txdate;
	}

	public void setTxdate(LocalDate txdate) {
		this.txdate = txdate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	
}
