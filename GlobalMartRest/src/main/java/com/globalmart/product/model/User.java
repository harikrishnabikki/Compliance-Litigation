package com.globalmart.product.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "user")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String userpassword;
	private String usertype;
	
	public User() {
	}

	public User(String username, String userpassword, String usertype)
	{
		this.username = username;
		this.userpassword = userpassword;
		this.usertype = usertype;
	}

	@Id
	public String getUsername() 
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getUserpassword() 
	{
		return userpassword;
	}

	public void setUserpassword(String userpassword)
	{
		this.userpassword = userpassword;
	}

	public String getUsertype() 
	{
		return usertype;
	}

	public void setUsertype(String usertype)
	{
		this.usertype = usertype;
	}

}

	