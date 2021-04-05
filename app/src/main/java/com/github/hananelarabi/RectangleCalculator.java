package com.github.hananelarabi;

import java.util.Scanner;

public class RectangleCalculator {
	public static void rectangleCalculator(Scanner input) {
		try {
		//Taking user inputs
		System.out.println("Please enter the length:");
		double length = input.nextDouble();
		
		System.out.println("Please enter the width:");
		double width = input.nextDouble();
		
		//Formulas
		double recarea = length*width;
		double recperimeter = 2*(length + width);
			
		//Print results
		System.out.println("Your rectangle perimeter is: " + recperimeter );
		System.out.println("Your rectangle area is: " + recarea );	
		}catch(Exception e) {
			System.out.println("Invalid Input!");
			
		}
	}
}
