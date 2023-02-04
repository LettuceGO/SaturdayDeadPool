package com.upskill.java_6;

public class Singleton {

			
		// Singleton is class that can have only one object
		// Private constructor, it prevents any other class from instantiatings

			private Singleton () {
			}
			
			
			private static Singleton SingletonObj = new Singleton();
		
				
				public static Singleton getInstance() {	//Only the get instance method is the way to access singleton
					return SingletonObj;
				}
			protected static void demo() {
				System.out.println("Singleton Demo Method");
			}
			
	}


