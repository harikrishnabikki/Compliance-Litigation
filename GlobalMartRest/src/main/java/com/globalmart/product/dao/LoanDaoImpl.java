package com.globalmart.product.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import com.globalmart.product.model.Loan;
//import com.globalmart.product.model.Product;

public class LoanDaoImpl implements LoanDao {

	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;

	@Override
	public boolean addEntity(Loan loan) throws Exception 
	{

		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(loan);
		tx.commit();
		session.close();
		return false;
	}

	@Override
	public Loan getEntityById(long loanNo) throws Exception {
		session = sessionFactory.openSession();
		Loan loan = (Loan) session.load(Loan.class,new Long(loanNo));
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return loan;
	}
	
		
	@SuppressWarnings("unchecked")
	@Override
	public List<Loan> getEntityList() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<Loan> loanlist = session.createCriteria(Loan.class).list();
		tx.commit();
		session.close();
		return loanlist;
	}
	
	@Override
	public boolean deleteEntity(Loan loan)
			throws Exception {
		session = sessionFactory.openSession();
		Object o = session.load(Loan.class, loan.getLoanNo());
		tx = session.getTransaction();
		session.beginTransaction();
		session.delete(o);
		tx.commit();
		return false;
	}
	
	@Override
	public boolean updateEntity(Loan modifyloan) throws Exception {
		
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.update(modifyloan);
		tx.commit();
		session.close();
		return false;
	}

}
