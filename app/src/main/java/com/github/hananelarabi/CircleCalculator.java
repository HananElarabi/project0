package com.github.hananelarabi;

import java.util.Scanner;

public class CircleCalculator {
	
	public static void circleCalculator(Scanner input) {
		
		String url = "jdbc:postgressql://localhost:5432/postgres";
		String username = "postgres";
		String password = "P4ssw0rd";

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
		 /*try{
			Connection connection = DriverManager.getConnection(url, username, password);
			int rowCount = statement.excecuteUpdate("Insert into students values('1','Hanan','Elarabi','30')");
			System.out.println(rowCount + "rows affectid.");
			
			ResultSet resulSet = statement.excecuteQuery("select * from students");*/
			
			/*//To print the table
			while(resultSet.next()){
			System.out.println(resultSet.getInt("id"));
			System.out.println(resultSet.getString("fName"));
			System.out.println(resultSet.getString("lName"));
			System.out.println(resultSet.getInt("Age"));
			
			}
			
			}catch(SQLException e){
				e.printStackTrace;
			}*/
			

	}

}
