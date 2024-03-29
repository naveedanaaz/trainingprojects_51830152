package com.bankapp.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankapp.model.entities.Account;
import com.bankapp.model.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

	Customer findByName(String name);
	Customer findByCity(String city);
	Customer findByemail(String email);
	Account findByAccountAccountNum(Long accountNum);
}
