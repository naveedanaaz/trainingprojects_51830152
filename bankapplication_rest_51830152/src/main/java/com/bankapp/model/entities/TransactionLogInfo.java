package com.bankapp.model.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "txloginfo_tabled")
public class TransactionLogInfo {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	private LocalDateTime timeStamp;
	private Long from_account;
	private Long to_account;
	private double txAmount;
	private String txType;
	private String authorityName;
	private String status;
	
	
	@Override
	public String toString() {
		return "TransactionLogInfo [id=" + id + ", timeStamp=" + timeStamp
				+ ", from_account=" + from_account + ", to_account="
				+ to_account + ", txAmount=" + txAmount + ", txType=" + txType
				+ ", authorityName=" + authorityName + ", status=" + status
				+ "]";
	}


	public TransactionLogInfo( Long from_account, Long to_account, double txAmount,
			String txType, String authorityName, String status) {
		
		this.timeStamp = LocalDateTime.now();
		this.from_account = from_account;
		this.to_account = to_account;
		this.txAmount = txAmount;
		this.txType = txType;
		this.authorityName = authorityName;
		this.status = status;
	}


	public TransactionLogInfo() {}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}


	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}


	public Long getFrom_account() {
		return from_account;
	}


	public void setFrom_account(Long from_account) {
		this.from_account = from_account;
	}


	public Long getTo_account() {
		return to_account;
	}


	public void setTo_account(Long to_account) {
		this.to_account = to_account;
	}


	public double getTxAmount() {
		return txAmount;
	}


	public void setTxAmount(double txAmount) {
		this.txAmount = txAmount;
	}


	public String getTxType() {
		return txType;
	}


	public void setTxType(String txType) {
		this.txType = txType;
	}


	public String getAuthorityName() {
		return authorityName;
	}


	public void setAuthorityName(String authorityName) {
		this.authorityName = authorityName;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	

}
