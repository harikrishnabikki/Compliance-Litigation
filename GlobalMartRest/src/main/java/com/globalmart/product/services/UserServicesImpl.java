package com.globalmart.product.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.globalmart.product.dao.UserDao;
import com.globalmart.product.model.User;

public class UserServicesImpl implements UserServices {

	@Autowired
	UserDao userDao;
	
	@Override
	public boolean addEntity(User user) throws Exception 
	{
		return userDao.addEntity(user);
	}
		
	@Override
	public User getEntityByName(String username) throws Exception 
	{
		return userDao.getEntityByName(username);
	}
		
	@Override
	public List<User> getEntityList() throws Exception 
	{
		return userDao.getEntityList();
	}

}
