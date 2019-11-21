package com.bankapp.model.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="account_tabled")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long accountNum;
	
	//@Column(unique = true)
	private Double balance;
	
	private boolean blocked;
	
	//@JsonIgnore
	@OneToOne(mappedBy = "account" , cascade = CascadeType.ALL , fetch = FetchType.EAGER)
	private Customer customer;
	
	@JsonIgnore
	@OneToMany(mappedBy = "account",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<AccountTransaction>accounttransactions=new ArrayList<>();
	
	public void addAccountTransaction(AccountTransaction tx) {
		accounttransactions.add(tx);
		tx.setAccount(this);
	}

	public Account(Double balance, boolean blocked, Customer customer) {
		
		this.balance = balance;
		this.blocked = blocked;
		this.customer = customer;
	}

	public Account() {}

	public Long getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(Long accountNum) {
		this.accountNum = accountNum;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public boolean isBlocked() {
		return blocked;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<AccountTransaction> getAccounttransactions() {
		return accounttransactions;
	}

	public void setAccounttransactions(List<AccountTransaction> accounttransactions) {
		this.accounttransactions = accounttransactions;
	}

	@Override
	public String toString() {
		return "Account [accountNum=" + accountNum + ", balance=" + balance + ", blocked=" + blocked + ", customer="
				+ customer + "]";
	}

	
}
