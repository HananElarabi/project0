package com.github.geocmetricalculator;

import java.util.Scanner;
/*import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;*/


public class CircleCalculator {
	
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
