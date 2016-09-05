package com.globalmart.product.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


@Entity
@Table(name = "statuss")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Status implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int scode;
	private String message;

	public Status() {
	}

	public Status(int scode, String message) {
		this.scode = scode;
		this.message = message;
	}

	public int getScode() {
		return scode;
	}

	public void setScode(int scode) {
		this.scode = scode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
