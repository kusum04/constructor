package com.kusum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Shirt s = new Shirt("White", 'M');
		
		s.setColor("White");
		s.setSize('M');
		s.putOn();
		
		
		System.out.println(s.color);
		System.out.println(s.size);
		
		Scanner scan = new Scanner("Shirt");
	}

}
