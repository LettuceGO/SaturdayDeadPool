package com.upskill.java_4;

import com.upskill.java_2.MethodsType;

public class polomorphism extends MethodsType{

	
	/* Polomorphism is thhe ability of an object to take on many forms.
		Method overloading(Compile time polomorphism.static binding) Same method name with different signature to overload
		Method overridding (Runtime polymorphism/Dynamic  binding) same method name from parent class to overide
	*/
	
	
	
	public static void main(String[] args) {
	
		car();
		car(2000);
		car("seats");
		car(250,"sexy");
		
		polomorphism obj = new polomorphism();
		obj. annualIncome();
	}
		
		public void annualIncome() {
		System.out.println ("My annual income = 200000");
		
	}

		public static void car() {
			System.out.println("My car is Lexus");
			
		}
		
		public static void car (int hp) {
			System.out.println("My car is lexus, " + "It breaks alot of neck because of the hp.");
		}

		public static void car (String seats) {
			System.out.println("My cars seats are comfortable, " + "Thats why alot of girls sit in it.");
		}
		
		public static void car (int battery, String motor) {
			System.out.println("My car is Lexus" + " It has a powerful battery : " + battery + " Plus a strong motor : " + "V10 Twin Turbo "+ motor);
		}
}
