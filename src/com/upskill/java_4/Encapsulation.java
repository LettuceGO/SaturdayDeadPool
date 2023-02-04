package com.upskill.java_4;

public class Encapsulation {

	//Encapsulation used to hide the data using setter and getter method
	
	
	private String name = "upskill";  		 //write & read
	private int ssn = 123456789;			 //write only
	private String username = "TahinMiddin"; //read only
	private String city;
	

	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
			obj. setName("Tahin");
			System.out.println(obj.getName());
			obj.setSSN(1234567890);
			System.out.println(obj.getusername());
			obj.setCity("NewYork");
			System.out.println(obj.getCity ());
			
	}
	
	//setter method - name					//set the data, write only
	public void setName(String value) {
		name = value;
	}
	
	
	//Getter method - name					//get the data, Read only
	public String getName() {
		return name;

	}

	//setter method = ssn   				//set the data, written
	public void setSSN (int value) {
		ssn = value;
	}
	
	//Getter Method = username 				//get the data, Read only
	public String getusername() {
		return username;
	}
	
	
	public String getage() {
		return getage();
			
	}
	 public void setCity(String value) {
		 city = value;
	 }
	public String getCity() {
		return city;
	}
	
	
	}
