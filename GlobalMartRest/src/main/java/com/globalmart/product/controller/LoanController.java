package com.globalmart.product.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.globalmart.product.model.Loan;
import com.globalmart.product.model.Status;
import com.globalmart.product.services.LoanServices;

@Controller
@RequestMapping("/loan")
public class LoanController {

	@Autowired
	LoanServices loanServices;

	static final Logger logger = Logger.getLogger(LoanController.class);

	@RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody
	Status addEntity(@RequestBody Loan loan) 
	{
		try 
		{
			System.out.println("Save Loan API called");
			System.out.println("Loan Name: "+loan.getCustomerName() +"Loan Amount : "+loan.getAmount());
			if ( (loan != null) && (loan.getLoanNo() == 0) )	{
				System.out.println("Add operation");
				loanServices.addEntity(loan);
			}
			else	{
				System.out.println("Update operation");
				loanServices.updateEntity(loan);
			}
			return new Status(0, "Loan added");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return new Status(1, e.getMessage());
		}

	}
	
	
	@RequestMapping(value = "/remove", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody
	Status deleteEntity(@RequestBody Loan loan) 
	{
		try 
		{
			System.out.println("Remove Loan API called");
			if (loan != null)	
			{
				System.out.println("Loan Name: "+loan.getCustomerName() +"Loan Amount : "+loan.getAmount());
			}
			loanServices.deleteEntity(loan);
			return new Status(0, "Loan Deleted");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return new Status(1, e.getMessage());
		}

	}
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody
	List<Loan> getLoan() {

		List<Loan> loanList = null;
		try {
			System.out.println("Inside /loan/list ");
			loanList = loanServices.getEntityList();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return loanList;
	}
}