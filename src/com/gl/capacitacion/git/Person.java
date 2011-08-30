package com.gl.capacitacion.git;
import java.util.Date;


public class Person {


	String names;
	String surname;
	Date  dob;
	Address address;
	String anotherField;
	String fieldBranch1;

	public Person(String name,String surname,Date dob,Address address,String anotherField){
	
		this.names = name;
		this.surname = surname;
		this.dob = dob;
		this.address = address;

		this.anotherField = anotherField;	
		int a = 1;

		this.fieldBranch1 = null;

	}

}
