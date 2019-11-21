package com.bankapp.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bankapp.model.entities.Account;
import com.bankapp.model.entities.AccountTransaction;
import com.bankapp.model.entities.TransactionLogInfo;
import com.bankapp.model.repo.AccountRepository;
import com.bankapp.model.repo.AccountTransactionRepository;
import com.bankapp.model.repo.CustomerRepository;
import com.bankapp.model.repo.TransactionLogInfoRepository;
import com.bankapp.model.service.exceptions.AccountNotFoundException;
import com.bankapp.model.service.exceptions.NotSufficientFundException;

@Service
@Transactional
public class AccountServiceImpl implements AccountService{

	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private AccountTransactionRepository accountTransactionRepository;
	
	@Autowired
	private TransactionLogInfoRepository transactionloginforepository;
	
	@Override
	public void createAccount(Account account) {
		accountRepository.save(account);
		customerRepository.save(account.getCustomer());
		
	}

	@Override
	public void deposit(Long accountNum, double amount) {
		Account account=accountRepository.findById(accountNum).orElseThrow(AccountNotFoundException::new);
		
		account.setBalance(account.getBalance() + amount);
		
		AccountTransaction accountTransaction=new AccountTransaction("deposit", amount);
		account.addAccountTransaction(accountTransaction);
		accountRepository.save(account);
		//accountTransactionRepository.save(accountTransaction);
		
		TransactionLogInfo info=new TransactionLogInfo(accountNum, null, amount, "deposit", "naaz", "completed");
		transactionloginforepository.save(info);
		
	}

	@Override
	public void withdraw(Long accountNum, double amount) {
		Account account=accountRepository.findById(accountNum).orElseThrow(AccountNotFoundException::new);
		if(account.getBalance()-amount < 1000)
			throw new NotSufficientFundException();
		account.setBalance(account.getBalance() - amount);
		AccountTransaction accountTransaction=new AccountTransaction("deposit", amount);
		account.addAccountTransaction(accountTransaction);
		accountRepository.save(account);
		
		TransactionLogInfo info=new TransactionLogInfo(accountNum, null, amount, "withdraw", "nav", "done");
		transactionloginforepository.save(info);
	}

	@Override
	public void transfer(Long fromAcc, Long toAcc, double amount) {
		this.withdraw(fromAcc, amount);
		this.deposit(toAcc, amount);
		TransactionLogInfo info=new TransactionLogInfo(fromAcc, toAcc, amount, "transfer", "nav", "done");
		transactionloginforepository.save(info);
	}

	@Override
	public void blockAccount(Long accountNum) {
		
		
	}

	@Override
	public Account addAccount(Account account) {

		return accountRepository.save(account);
	}

	@Override
	public void deleteAccount(Long id) {
		accountRepository.deleteById(id);
		
	}

	@Override
	public Account updateAccount(Long id, Account account) {
		Account acctoBeUpdated=accountRepository.findById(id).orElseThrow(AccountNotFoundException::new);
	    acctoBeUpdated.setCustomer(account.getCustomer());
		return accountRepository.save(acctoBeUpdated);
		
	}

	@Override
	public List<Account> getAllaccounts() {

		return accountRepository.findAll();
	}

}
