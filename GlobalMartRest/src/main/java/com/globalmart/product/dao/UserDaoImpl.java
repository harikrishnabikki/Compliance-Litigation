package com.globalmart.product.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.globalmart.product.model.User;

public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;

	@Override
	public boolean addEntity(User user) throws Exception {

		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();

		return false;
	}	

	@Override
	public User getEntityByName(String username) throws Exception {
		session = sessionFactory.openSession();
		User user = (User) session.load(User.class,new String(username));
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return user;
		}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<User> getEntityList() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<User> userList = session.createCriteria(User.class).list();
		tx.commit();
		session.close();
		return userList;
	}
				
	}

