package com.bankapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.bankapp.model.entities.Account;
import com.bankapp.model.entities.Customer;
import com.bankapp.model.entities.TransactionLog;
import com.bankapp.model.entities.User;
import com.bankapp.model.repo.AccountRepository;
import com.bankapp.model.repo.AccountTransactionRepository;
import com.bankapp.model.repo.CustomerRepository;
import com.bankapp.model.repo.TransactionLogRepository;
import com.bankapp.model.repo.UserRepository;
import com.bankapp.model.service.AccountServiceImpl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.*;
@EnableTransactionManagement
@SpringBootApplication
public class BankappV1Application implements CommandLineRunner{

	@Autowired
	private TransactionLogRepository txRepo;
	
	
	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private AccountTransactionRepository accountTransactionRepository;

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private TransactionLogRepository transactionLogRepository;

	public static void main(String[] args) {
		SpringApplication.run(BankappV1Application.class, args);

	}
	
	@Autowired
	private AccountServiceImpl accountService;
	

	@Override
	public void run(String... args) throws Exception {
		
		/*TransactionLog log2=new TransactionLog
				(4L, 8L, "transfer", 100, "saha", "done");
		log2.setTimeStamp(LocalDateTime.of(
				LocalDate.of(2018, Month.JANUARY, 19), LocalTime.now()));
		txRepo.save(log2);*/
		
		List<TransactionLog>list=txRepo.findByTimeStampBetween
				(LocalDateTime.of(LocalDate.of(2017, Month.JANUARY, 1), LocalTime.now())
					,LocalDateTime.of(LocalDate.of(2019, Month.NOVEMBER,27 ),
							LocalTime.now() ));
		for(TransactionLog l:list)
			System.out.println(l);
		
		
		/*Account account = accountService.getAccountById(6L);
		Customer customer = customerRepository.findById(6L);
		accountRepository.delete(account);
		customerRepository.delete(customer);*/
		/*account.setCustomer(customer);
		customer.setAccount(account);
		accountRepository.save(account);
		System.out.println(account);
		System.out.println(customer);
		*/
	//accountService.deposit(2L, 100);
		
		
		
		//Account account=accountRepository.findById(1L).orElseThrow(RuntimeException::new);
		//accountRepository.delete(account);
		
//		Customer customer=new Customer("naaz", "n@gmail.com", "5454545545", "hyd", "hyd", "india");
//	Customer customer2=new Customer("srey", "s@gmail.com", "54598589545", "noida", "UP", "india");
//		Customer customer3=new Customer("ray", "r@gmail.com",
//				"5974545545", "banglore", "Karnataka", "india");
//		
//		Account account=new Account(20000.0, customer, false);
//		Account account2=new Account(10000.0, customer2, false);
//		Account account3=new Account(25000.0, customer3, false);
//		
//		customer.setAccount(account);
//		customer2.setAccount(account2);
//		customer3.setAccount(account3);
//		
//		accountRepository.save(account);
//		accountRepository.save(account2);
//		accountRepository.save(account3);
//		
//		
//
//		User user1=new User("lena", "lena", "l@.com", "54545455", "swiz", 
//				new String[]{"ROLE_ADMIN","ROLE_MGR","ROLE_CLERK"}, true);
//		
//		User user2=new User("riya", "riya", "r@.com", "54545455", "london", 
//				new String[]{"ROLE_MGR","ROLE_CLERK"}, true);
//		
//		User user3=new User("sreya", "sreya", "s@.com", "54545455", "paris", 
//				new String[]{"ROLE_CLERK"}, true);
//
//		User user4=new User("tina", "tina", "t@.com", "54545455", "delhi", 
//				new String[]{"ROLE_CLERK"}, true);
//		
//		userRepository.save(user1);
//		userRepository.save(user2);
//		userRepository.save(user3);
//	userRepository.save(user4);
		
	
	}

}
















