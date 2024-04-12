package com.kusum;

public class Shirt {

	//Main.java is the correlated to this class 
		//OOP Object Oriented Programming
	public static String color;
	public static char size;
	
		Shirt()	{}
		
		Shirt(String newColor, char newSize) {
			
			color = newColor;
			size = newSize;
		}
				
	public static void putOn() {
		System.out.println("Shirt is On!!");
		
	}
	
	public static void takeOff() {
		System.out.println("Shirt is off!!");
	}

		public static void setColor(String newColor) {
			
			color = newColor;
		}
		
		public static void setSize(char newSize) {
			
			size = newSize;
		}
}
