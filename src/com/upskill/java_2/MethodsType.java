package com.upskill.java_2;

public class MethodsType {

	
	public static int hourlyincome = 65;
	
	public static void main(String[] args) {
	MethodsType obj = new MethodsType();
	obj.annualIncome();
		
	
	weeklyIncome();
	biweeklyincome();
	Tahin();
	ullah();
	NewYork();
	Middin();
	
	System.out.println("My monthly income = " + obj.monthlyincome());
	}
	
	public void annualIncome() {
		int calculateannualIncome = hourlyincome *2000;
		System.out.println("My annual Income = " + calculateannualIncome);

}
	
	public static void weeklyIncome() {
		int calculateweeklyincome = hourlyincome *40;
		System.out.println("My weekly Income = " + calculateweeklyincome);
	}
	
	public int monthlyincome() {
		int calculatemonthlyincome = hourlyincome * 180;
		return calculatemonthlyincome;
	}
	
	public static void biweeklyincome() {
		int calculatebiweeklyincome = hourlyincome *80;
		System.out.println("My bi weekly income = " + calculatebiweeklyincome);
		
	}
	//Method 
	public static void Tahin() {		//Method
		String name = "Tahin Middin";	//Variable
		int age = 100;					//Variable
		System.out.println(name);
	}
	
	public static void ullah() {
		String name = "spongbob Misses his old self";
		int time = 2021;
		System.out.println(name);
	
	}
	
	static String Middin() {
		String name = "Tahin will buy a chicken burger";
		return name;
		
	}
	
	public static void NewYork() {
		String name = "Queens is amazing";
		System.out.println(name);
	}
	
	
	
}
	
	
	