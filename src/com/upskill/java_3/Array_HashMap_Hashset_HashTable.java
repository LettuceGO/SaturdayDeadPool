package com.upskill.java_3;

import java.util.*;

public class Array_HashMap_Hashset_HashTable {

	public static void main(String[] args) {
		

				//Array store multiple data using index
				
				int age = 30;											//Variable
				int[] ageDeadpool = new int[]{25, 21, 35, 30, 40};		//Array
				
				//Array index				 [0]  [1] [2] [3] [4]
				
				System.out.println("Student Age : " + ageDeadpool[4]);
				System.out.println("Total Student : " + ageDeadpool.length);
				
				String[] nameDeadpool = new String[]{"Masud", "Tahin", "Zaman", "Razzak", "Tanzu", "Shamme"};
				
				System.out.println("Student Name : " + nameDeadpool[1]);
				System.out.println("Total Student Name: " + nameDeadpool.length);
				
				//nameCity
				String[] nameCity = new String[]{"NYC", "Bloomfield", "Sylhet", "Dhaka", "Buffelo", "Tokyo"};
				
				System.out.println("City Name : " + nameCity[3]);
				System.out.println("Total City: " + nameCity.length);	
				
				
				//Multi-Dimentional Array
				int[][] ageUpSkill2D = {{25, 21, 35, 30, 40},     //[0][0] [0][1] [0][2] [0][3] [0][4] [0][5]
									  {24, 28, 29, 46}};          //[1][0] [1][1] [1][2] [1][3] [1][4]
				
				System.out.println("Student Age 2D : " + ageUpSkill2D[0][3]);
				
				
				// Hashmap store multipul data using key-value pair, Implementation of Map interface
				
				HashMap<String, Integer> Student = new HashMap<String, Integer>();
				
				Student.put("Tanzu", 22);
				Student.put("Tahin", 21);
				Student.put("Masud", 24);
				Student.put("Shisir", 24);
				
				System.out.println("HashMap Student Age : "+ Student.get("Tahin"));
				
				HashMap<String, String> Capital = new HashMap<String, String>();
				
				Capital.put("BD", "Dhaka");
				Capital.put("USA", "Washington DC");
				
				System.out.println("Capital City : " + Capital.get("BD"));	
				
				//Hashset store unordered collection containing unique value, Implementation of Set interface
				
				HashSet<String> car = new HashSet<String>();
				
				car.add("BMW");
				car.add("Toyota");
				car.add("Audi");
				car.add("Ford");
				
				System.out.println("Car : " + car);
				
				
				//HashTable store multiple data using key-Value pair, No duplicate, also is synchronized ( Only one thread can be modified)
				
				Hashtable<String, String> Region = new Hashtable<String, String>();
				
				Region.put("BD", "Asia");
				Region.put("USA", "America");
				
				System.out.println("Region : " + Region.get("BD" , "USA"));
				
				
			
			}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


