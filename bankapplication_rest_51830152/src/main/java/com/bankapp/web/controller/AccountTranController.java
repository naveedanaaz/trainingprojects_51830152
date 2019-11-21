package com.bankapp.web.controller;


import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.model.entities.Account;
import com.bankapp.model.service.AccountService;
import com.bankapp.web.controller.requests.DepositRequest;
import com.bankapp.web.controller.requests.TransferRequest;
import com.bankapp.web.controller.requests.WithdrawRequest;

@RestController
@RequestMapping(path="api")
public class AccountTranController {
	
	@Autowired
	private AccountService accountService;
	
//	@PostMapping(path = "account/deposit/{accountNum}/{amount}",consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<Account> deposit(@PathVariable(name="accountNum")Long accountNum,@PathVariable(name="amount") double amount) {
//		accountService.deposit(accountNum, amount);
//		return new ResponseEntity<Account>(HttpStatus.OK);
//	}
	
	@PostMapping(path="/transaction/deposit")
	private ResponseEntity<Void> Deposit(@RequestBody DepositRequest req, Principal principal){
		accountService.deposit(req.getAccountNum(), req.getAmount());
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
//	@PostMapping(path="account/withdraw/{accountNum}/{amount}",consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
//	public  ResponseEntity<Account> withdraw(@PathVariable(name="accountNum")Long accountNum,
//			@PathVariable(name="amount")double amount){
//		accountService.withdraw(accountNum, amount);
//        return new ResponseEntity<Account>(HttpStatus.OK);
//	}
        
	@PostMapping(path="/transaction/withdraw")
	private ResponseEntity<Void> Withdraw(@RequestBody WithdrawRequest req, Principal principal){
		accountService.withdraw(req.getAccountNum(), req.getAmount());
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
//        @PostMapping(path="account/transfer/{fromAcc}/{toAcc}/{amount}", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
//        public ResponseEntity<Account> transfer(@PathVariable(name="fromAcc")Long fromAcc,
//        		@PathVariable(name="toAcc")Long toAcc, @PathVariable(name="amount")double amount){
//        	accountService.transfer(fromAcc, toAcc, amount);
//        	return new ResponseEntity<Account>(HttpStatus.OK);
//	}
	
	@PostMapping(path="/transaction/transfer")
	private ResponseEntity<Void> Transfer(@RequestBody TransferRequest req, Principal principal){
		accountService.transfer(req.getFromAcc(), req.getToAcc(), req.getAmount());
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
