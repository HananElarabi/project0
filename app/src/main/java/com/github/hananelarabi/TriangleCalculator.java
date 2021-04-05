package com.github.hananelarabi;
import java.util.Scanner;

public class TriangleCalculator {
	public static void triangleCalculator(Scanner input) {
		
		try {
		//Taking user inputs
		System.out.println("Please enter the height:");
		double height = input.nextDouble();
		
		System.out.println("Please enter the base:");
		double base = input.nextDouble();
		
		System.out.println("Please enter the first side:");
		double fside = input.nextDouble();
		
		System.out.println("Please enter the second side:");
		double sside = input.nextDouble();
		
		//Formulas
		double triperimeter = base + fside + sside;
		double triarea = base*height/2;
		
		//Print results
		System.out.println("Your triangle perimeter is: " + triperimeter );
		System.out.println("Your triangle area is: " + triarea );
		}catch(Exception e) {
			System.out.println("Invalid Input!");
			
		}
		
	}
}