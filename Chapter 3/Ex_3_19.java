/*
Author: Justin Garnica
Date: 10/17/2018
Compute perimiter of triangle
*/

import java.util.Scanner;

public class Ex_3_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter three edges for a triangle:");
		System.out.print(" side 1: ");
		double side1 = input.nextDouble();
		System.out.print(" side 2: ");
		double side2 = input.nextDouble();
		System.out.print(" side 3: ");
		double side3 = input.nextDouble();
				boolean valid = (side1 + side2 < side3)
				(side1 + side3 < side2)
				CONTINUE HERE
		if (!valid)
		{
			System.out.println("Input is invalid.");
			System.exit(1);
		}

		System.out.println("perimeter of triangle is " + (side1 + side2 + side3));
	}
}