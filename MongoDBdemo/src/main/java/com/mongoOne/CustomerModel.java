package com.mongoOne;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "estore")
public class CustomerModel {
	@Id
	private String id;
	private String name;
	private String desig;
	private String salary;
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDesig() {
		return desig;
	}


	public void setDesig(String desig) {
		this.desig = desig;
	}


	public String getSalary() {
		return salary;
	}


	public void setSalary(String salary) {
		this.salary = salary;
	}

	

	public CustomerModel(String id, String name, String desig, String salary) {
		super();
		this.id = id;
		this.name = name;
		this.desig = desig;
		this.salary = salary;
	}


	public CustomerModel()
	{
	}
	}
	

	