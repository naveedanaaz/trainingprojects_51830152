package com.bankapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.bankapp.model.entities.Account;
import com.bankapp.model.entities.Customer;
import com.bankapp.model.entities.User;
import com.bankapp.model.repo.AccountRepository;
import com.bankapp.model.repo.AccountTransactionRepository;
import com.bankapp.model.repo.CustomerRepository;
import com.bankapp.model.repo.TransactionLogInfoRepository;
import com.bankapp.model.repo.UserRepository;
import com.bankapp.model.service.AccountService;

@EnableTransactionManagement
@SpringBootApplication
public class BankdemoApplication implements CommandLineRunner {

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private AccountTransactionRepository accountTransactionRepository;

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private TransactionLogInfoRepository transactionLogInfoRepository;

	public static void main(String[] args) {
		SpringApplication.run(BankdemoApplication.class, args);

	}

	@Autowired
	private AccountService accountService;

	@Override
	public void run(String... args) throws Exception {
		
		//accountService.createAccount(new Account(10000, false, customer4));

		//accountService.transfer(2L, 1L, 500);
		//accountService.deposit(1L, 1500.0);

		
//		  Customer customer1=new Customer("naaz", "naaz@gmail", "989867659", "btm", "bangalore", "India");
//		  Customer customer2=new Customer("root", "root@gmail", "123443232", "abcstr", "seoul", "south korea");
//		  Customer customer3=new Customer("lee", "lee@gmail", "786567767", "parkstr", "Los angels", "america");
//		  
//		  
//		  
//		  Account account1=new Account(9000.0, false, customer1); 
//		  Account account2=new Account(8000.0, false, customer2); 
//		  Account account3=new Account(6000.0,false, customer3);
//		  
//
//		  
//		  customer1.setAccount(account1); 
//		  customer2.setAccount(account2);
//		  customer3.setAccount(account3);
//		  
//		  
//		 accountRepository.save(account1); 
//		 accountRepository.save(account2);
//		 accountRepository.save(account3);
//		 
//
//		User user1=new User("apple", "apple123", "86755445", "layout", "a@a", new String[] {"ROLE_ADMIN"},true);
//		User user2=new User("banana", "banana123", "897655456", "lucknow", "b@b", new String[] {"ROLE_MGR"}, true);
//		User user3=new User("pear", "pear123", "96342456", "hyd", "p@p", new String[] {"ROLE_CLERK"},true);
//		
//		userRepository.save(user1);
//		userRepository.save(user2);
//		userRepository.save(user3);
		//accountService.deposit(2l,29.0);
	}

}
