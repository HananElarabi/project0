package com.github.geocmetricalculator;

//import java.sql.DriverManager;
//import java.sql.SQLException;
import java.util.Scanner;
//import java.sql.Connection;
//import java.sql.Statement;


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
		System.out.println("Your circle area is: " + ciarea);
		System.out.println("Your circle diameter is: " + cidiameter);
		System.out.println("Your circle circumference is: " + cicircumference);
		}catch(Exception e) {
			System.out.println("Invalid Input!");
			
		}
		 

		//********************************************************************************************* *//

		/*String url = "jdbc:postgressql://localhost:5432/postgres";
		String username = "postgres";
		String password = "P4ssw0rd";*/
		
			//try {

				//Connection connection = DriverManager.getConnection(url, username, password);
				//Statement statement = connection.createStatement();
				//int rowCount = statement.excecuteUpdate("Insert into students values('1','Hanan','Elarabi','30')");

			// } catch (SQLException e) {
				// e.printStackTrace();
			// }
		

	}

}
