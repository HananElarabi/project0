package com.github.hananelarabi;

import java.util.Scanner;

public class MilesToKilometers {

	public static void milesTokilometers(Scanner input) {
		
		try {
		//Taking user input
		System.out.println("Please enter the distance:");
		double miledistance = input.nextDouble();
		
		//Formulas
		double kmdistance = miledistance*1.609;

		//Print results
		System.out.println("The distance is: " + kmdistance + " km");
		}catch(Exception e) {
			System.out.println("Invalid Input!");}
	}
	
}
