package com.abhinav.exercise.day2.exercise1;

public class Singleton {
	
	private static Singleton instance;
	private Singleton() {}
	
	public static synchronized Singleton getInstance() {
		if(instance==null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public void display() {
		System.out.println("Hello Everyone");
	}

}