package com.github.unitsconverter;

import java.util.Scanner;

public class FeetToMeters {

	public static void footTometer(Scanner input) {
		
		try {
		//Taking user input
		System.out.println("Please enter the length:");
		double ftlength = input.nextDouble();
		
		//Formulas
		double mlength = ftlength/3.281;


		//Print results
		System.out.println("The length is: " + mlength + " m");
		}catch(Exception e) {
			System.out.println("Invalid Input!");}
	}
}
