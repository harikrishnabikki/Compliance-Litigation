package com.globalmart.product.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.globalmart.product.model.Status;
import com.globalmart.product.model.User;
import com.globalmart.product.services.UserServices;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserServices userServices;

	static final Logger logger = Logger.getLogger(UserController.class);

	@RequestMapping(value = "/register", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody
	Status addEntity(@RequestBody User user) {
		try 
		{
			System.out.println("register API called");
			if (user != null)	
			{
				System.out.println("Name : "+user.getUsername());
			}
			userServices.addEntity(user);
			return new Status(0, "Useradded");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return new Status(1, e.getMessage());
		}

	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody
	Status login(@RequestBody User user) {
		try 
		{
			System.out.println("Login API called");
			System.out.println("UserName: "+user.getUsername());
			User loggedUser = userServices.getEntityByName(user.getUsername());
			
			if ( loggedUser == null)	{
				return new Status(1,"Invalid Username and Password");
			}
			else if (! user.getUserpassword().equals(loggedUser.getUserpassword()))
			{
				return new Status(1,"Invalid Username and Password");
				
			}
			else if ( ! user.getUsertype().equals(loggedUser.getUsertype()))	
			{
				return new Status(1,"Invalid Username and Password");
							
			}
			
			return new Status(0,"Login successful");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return new Status(1,"Invalid Username and Password");
		}

	}

	@RequestMapping(value = "/{username}", method = RequestMethod.GET)
	public @ResponseBody
	User getUser(@PathVariable("username") String username) {
		User user = null;
		try {
			user = userServices.getEntityByName(username);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody
	List<User> getUser() {

		List<User> userList = null;
		try {
			
			userList = userServices.getEntityList();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return userList;
	}

}
