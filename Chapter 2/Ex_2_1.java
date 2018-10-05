/* 
Author: Cole Buehler
Date 10/5/2018

Created equation to convert Celsius to Fahrenheit
*/
import java.util.Scanner;

class Ex_2_1 {
	public static void main(String[] args) {
		// declare variables
		Scanner input = new Scanner (System.in);
		double Fahrenheit = 0.0;
		double Celsius = 0.0;
		
		// Prompt user
		System.out.println("We are going to convert Celsius to Fahrenheit.");
		System.out.print ("Enter the Celsius degree you want to convert: ");
		Celsius = input.nextDouble();
		
		// Solve for area
		Fahrenheit = (9.0 / 5.0) * (Celsius) + 32;
		
		// Display results
		System.out.println("This conversion comes out to " + Fahrenheit);
	}
}