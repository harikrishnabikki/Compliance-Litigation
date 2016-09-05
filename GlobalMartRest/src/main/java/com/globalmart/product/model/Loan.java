package com.globalmart.product.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "loan")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Loan implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "loanNo")
	private long loanNo;

	@Column(name = "customerName")
	private String customerName;
	
	@Column(name = "amount")
	private double amount;

	@Column(name = "interest")
	private String interest;
	
	@Column(name = "createdDate")
	private String createdDate;
	
	@Column(name = "statuss")
	private String statuss;
	
	@Column(name = "remarks")
	private String remarks;
	
	
	
	public Loan()	{
		
	}
	
	public Loan(long loanNo, double amount, String interest, String createdDate,String statuss,String remarks )	
	{
		this.loanNo = loanNo;
		this.amount = amount;
		this.interest = interest;
		this.createdDate = createdDate;	
		this.statuss = statuss;
		this.remarks = remarks;
	}

	public long getLoanNo() {
		return loanNo;
	}

	public void setLoanNo(long loanNo) {
		this.loanNo = loanNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getStatuss() {
		return statuss;
	}

	public void setStatuss(String statuss) {
		this.statuss = statuss;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}




}