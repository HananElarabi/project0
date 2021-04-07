package com.github.geocmetricalculator;

import java.util.Scanner;


public class CircleCalculator {
	// static double radius;
	// static double ciarea;
	// static double cidiameter;
	// static double cicircumference;
	


	public static void circleCalculator(Scanner input) {

		try {
		//Taking user input
		System.out.println("Please enter the radius:");
		double radius = input.nextDouble();
		
		//Formulas
		double ciarea = 3.14*radius*radius;
		double cidiameter = 2*radius; 
		double cicircumference = 2*3.14*radius;
		
		//Print results
		System.out.println("\nYour circle area is: " + ciarea);
		System.out.println("Your circle diameter is: " + cidiameter);
		System.out.println("Your circle circumference is: " + cicircumference +"\n");
		}catch(Exception e) {
			System.out.println("Invalid Input!");
			
		}
			
			
	}
}

		