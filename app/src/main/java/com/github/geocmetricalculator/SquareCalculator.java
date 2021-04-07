package com.github.geocmetricalculator;

import java.util.Scanner;

public class SquareCalculator {

	public static void squareCalculator(Scanner input) {
		
		try {
		//Taking user input
		System.out.println("Please enter the length:");
		double length = input.nextDouble();
		
		//Formulas
		double sqarea = length*length;
		double sqperimeter = length * 4;
		
		//Print results
		System.out.println("Your square area is: " + sqarea);
		System.out.println("Your square perimeter is: " + sqperimeter);	
		}catch(Exception e) {
			System.out.println("Invalid Input!");
			
		}
    }
}