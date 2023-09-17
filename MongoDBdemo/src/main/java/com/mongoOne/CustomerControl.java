package com.mongoOne;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerControl {
	
	@Autowired
	private CustomerService custserv;;
	
	@PostMapping("/addUser")
	public CustomerModel addCustomer(@RequestBody CustomerModel custmodel)
	{
		return custserv.addUser(custmodel);
	}
	@GetMapping("/getUsers")
	public List<CustomerModel> getAllCustomerModel()
	{
		return custserv.getUsers();
	}
	
	}


