package com.bankapp.web.controller.requests;

public class TransferRequest {

	private Long fromAcc;
	private Long toAcc;
	private Double amount;
	
	public Long getFromAcc() {
		return fromAcc;
	}
	public void setFromAcc(Long fromAcc) {
		this.fromAcc = fromAcc;
	}
	public Long getToAcc() {
		return toAcc;
	}
	public void setToAcc(Long toAcc) {
		this.toAcc = toAcc;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
}
