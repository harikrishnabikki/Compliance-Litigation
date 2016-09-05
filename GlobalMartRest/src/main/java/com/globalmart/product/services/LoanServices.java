package com.globalmart.product.services;

import java.util.List;

import com.globalmart.product.model.Loan;

public interface LoanServices {

	public boolean addEntity(Loan loan) throws Exception;
	public Loan getEntityById(long loanNo) throws Exception;
	public List<Loan> getEntityList() throws Exception;
	public boolean deleteEntity(Loan loan) throws Exception;
	public boolean updateEntity(Loan modifyloan) throws Exception;
	
}
