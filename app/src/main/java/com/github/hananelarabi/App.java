/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.github.hananelarabi;
import java.util.Scanner;
import com.github.geocmetricalculator.GeoCalculator;
import com.github.unitsconverter.unitConverter;


/*import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;*/


public class App {

	
	public static void main(String[] args) {
	
		boolean isValid = false;
		while(!isValid) {
			System.out.println("\n((||-----Welcome to to project0 !-----||))\n");
			
			Scanner input = new Scanner(System.in);
	
			
			System.out.println("Please choose your tool:\n"
					+ "1- geometrical calculator  2-units converter  q- to quit ");
				
					String choice = input.nextLine();
		
					switch (choice) {
					case "1":	
						GeoCalculator.gCalculator(input);
						break;
					case "2":
						unitConverter.uConvertert(input);
						break;
					case "q":
						System.exit(0);
						break;
					default:
						System.out.println("Sorry you made a wrong choice!\n ");
						isValid = false;
	
					}
			}				

	}
	public String getGreeting(){
		return "Hello World";
	}	
}
