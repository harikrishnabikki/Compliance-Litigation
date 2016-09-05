package com.globalmart.product.dao;

import java.util.List;


import com.globalmart.product.model.User;

public interface UserDao 
{
	
	public boolean addEntity(User user) throws Exception;
	public User getEntityByName(String username) throws Exception;
	public List<User> getEntityList() throws Exception;
	
}
