package com.github.unitsconverter;

import java.util.Scanner;

public class KilometersToMiles {

	public static void kilometersTomiles(Scanner input) {
		try {
		//Taking user input
		System.out.println("Please enter the distance:");
		double kmdistance = input.nextDouble();
		
		//Formulas
		double miledistance= kmdistance/1.609;

		//Print results
		System.out.println("The distance is: " + miledistance + " miles");
		}catch(Exception e) {
			System.out.println("Invalid Input!");}
	}

}
