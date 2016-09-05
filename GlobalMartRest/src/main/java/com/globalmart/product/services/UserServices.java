package com.globalmart.product.services;

import java.util.List;

import com.globalmart.product.model.User;


public interface UserServices 
{
	
	public boolean addEntity(User user) throws Exception;
	public User getEntityByName(String username) throws Exception;
	public List<User> getEntityList() throws Exception;
	
	
}
