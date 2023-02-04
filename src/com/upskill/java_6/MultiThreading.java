package com.upskill.java_6;

public class MultiThreading {
	
		//MultiThreading is a java feature that allows concurrent executives of two or more parts of a program/
		//Threads can be created using two mechanisms :
		//1. Extending the thread class
		//2. Implementing the Runnable interface //
		
		public static void main(String[] args) {
			aForLoop();
				}
		
		public static void aForLoop() {
			int t; 
			for (t = 1; t<=50; t++) {
				System.out.println("Thread Number " + t);
				
				MultiThreadingThread obj = new MultiThreadingThread();
				obj.start();
				
				Thread obj2 = new Thread ( new MultiThreadingRunnable());
				obj2.start();
				
				
			}
	
	}

}
