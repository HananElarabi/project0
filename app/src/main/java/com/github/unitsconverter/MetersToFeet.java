package com.github.unitsconverter;

import java.util.Scanner;

public class MetersToFeet {
			public static void meterTofoot(Scanner input) {
				try {
				//Taking user input
				System.out.println("Please enter the length:");
				double mlength = input.nextDouble();
				
				//Formulas
				double ftlength = mlength*3.281;

				//Print results
				System.out.println("The length is: " + ftlength + "ft");
				}catch(Exception e) {
					System.out.println("Invalid Input!");}
			}
			

}
