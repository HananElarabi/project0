package com.github.hananelarabi;
import java.util.Scanner;


public class unitConverter {
	
	public static void uConvertert(Scanner input) {

		System.out.println("Welcome to Units converter!");
		System.out.println("Please choose your converter:\n"
			+ "1-Meters to feet\n2-Feet to meters\n"
			+ "3-Miles to kilometers\n4-kilometers to Miles\nq- to quit\n ");
			String uchoice = input.nextLine();
			
			switch (uchoice) {
			case "1":
				MetersToFeet.meterTofoot(input);
				break;
			case "2":
				FeetToMeters.footTometer(input);
				break;
			case "3":
				MilesToKilometers.milesTokilometers(input);
				break;
			case "4":
				KilometersToMiles.kilometersTomiles(input);
				break;
			case "q":
				System.exit(0);
				break;
				default:
					System.out.println("Sorry you made a wrong choice!"); 
			}
	
		}
		
					
	
}
