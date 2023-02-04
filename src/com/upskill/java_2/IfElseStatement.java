package com.upskill.java_2;

public class IfElseStatement {

	
	//Conditional Statement
	
	public static void main(String[] args) {
		
		int age = 101; 
		
		if (age <=13) {
			System.out.println("You are children");
		} else if (age  >13 && age <18) {
			System.out.println("Youre a teenager");
		} else if (age >= 60) {
			if (age > 100) {
				System.out.println("You are legend");
			}else
			System.out.println("Your a senior");
		}else {
			System.out.println("You are adult");
		}

		
		
		int percentage = 55;
		
		if (percentage > 90) {
			System.out.println("Assign Grade A");
		}else if (percentage > 75);{
			System.out.println("Assign Grade B");}
		} else if (percentage > 65);{
			System.out.println("Assign Grade C");
		}
}