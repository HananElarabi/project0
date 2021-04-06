package com.github.geocmetricalculator;

import java.util.Scanner;

public class GeoCalculator {
	
	public static void gCalculator(Scanner input) {
		System.out.println("Welcome to Geometrical calculator!");
		System.out.println("Please choose your shape:\n"
		+ "1- Square  2-Circle 3-Tringle 4-Rectangle  q- to quit ");

		String gchoice = input.nextLine();
		
		switch (gchoice) {
		case "1":
			SquareCalculator.squareCalculator(input);
			break;
		case "2":
			CircleCalculator.circleCalculator(input);
			break;
		case "3":
			TriangleCalculator.triangleCalculator(input);
			break;
		case "4":
			RectangleCalculator.rectangleCalculator(input);
			break;
		case "q":
			System.exit(0);
			break;
			default:
				System.out.println("Sorry you made a wrong choice!"); 
		
	  }

	}
		
}
				