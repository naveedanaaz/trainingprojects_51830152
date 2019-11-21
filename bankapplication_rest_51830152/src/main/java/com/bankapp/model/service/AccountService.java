package com.bankapp.model.service;

import java.util.List;

import com.bankapp.model.entities.Account;

public interface AccountService {

	void createAccount(Account account);
	void deposit(Long accountNum, double amount);
	void withdraw(Long accountNum, double amount);
	void transfer(Long fromAcc, Long toAcc, double amount);
	void blockAccount(Long accountNum);
	
	
	public Account addAccount(Account account);
	public void deleteAccount(Long id);
	public Account updateAccount(Long id,Account account);
    public List<Account> getAllaccounts();
    
}
