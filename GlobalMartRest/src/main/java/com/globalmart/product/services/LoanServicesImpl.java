package com.globalmart.product.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.globalmart.product.dao.LoanDao;
import com.globalmart.product.model.Loan;


public class LoanServicesImpl implements LoanServices {

	@Autowired
	LoanDao loanDao;
	
	@Override
	public boolean addEntity(Loan loan) throws Exception {
		return loanDao.addEntity(loan);
	}

	@Override
	public Loan getEntityById(long loanNo) throws Exception {
		return loanDao.getEntityById(loanNo);
	}
	
	@Override
	public List<Loan> getEntityList() throws Exception 
	{
		return loanDao.getEntityList();
	}

	@Override
	public boolean deleteEntity(Loan loan) throws Exception {
		return loanDao.deleteEntity(loan);
	}
	
	@Override
	public boolean updateEntity(Loan modifyloan) throws Exception {
		return loanDao.updateEntity(modifyloan);
	}
}
