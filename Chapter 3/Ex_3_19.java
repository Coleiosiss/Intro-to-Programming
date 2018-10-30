/*
Author: Cole Buehler
Date: 10/24/2018

Finding The perimeter of a triangle with a invalid checker
*/

import java.util.Scanner;

public class Ex_3_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//Prompt user and declaring valuables
		System.out.println("Enter three edges for a triangle:");
		System.out.print(" side 1: ");
		double side1 = input.nextDouble();
		System.out.print(" side 2: ");
		double side2 = input.nextDouble();
		System.out.print(" side 3: ");
		double side3 = input.nextDouble();
				
				// Test if input is valid
				boolean valid = (side1 > side3 && side2 > side3) ||
				boolean valid = (side1 + side2 > side3) &&
				(side1 + side3 > side2) &&
				(side2 + side1 > side3) &&
				(side2 + side3 > side1) &&
				(side3 + side1 > side2) &&
				(side3 + side2 > side1);
		if (!valid)
		{
			System.out.println("Input is invalid.");
			System.exit(1);
		}

		// Calculating and telling user result
		System.out.println("perimeter of triangle is " + (side1 + side2 + side3));
		
	}
}