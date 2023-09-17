package com.mongoOne;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository custrep;
	
	public CustomerModel addUser(@RequestBody CustomerModel custmodel)
	{
		return custrep.save(custmodel);
	}
	public List<CustomerModel> getUsers(){
		return custrep.findAll();
	}

}
