/*
Author: Cole Buehler
Date: 10/30/2018

Write a program to determine if a point is in a rectangle
*/

import java.util.Scanner;

class Ex_3_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter Point x and Point y
		System.out.println("Enter 2 points to see if its in a given rectangle: ");
		System.out.print("Point x: ");
		double pointx = input.nextDouble();
		System.out.print("Point y: ");
		double pointy = input.nextDouble();
		
		//Test if points are in the rectangle
		boolean withinRectangle = (Math.pow(Math.pow(pointx, 2), 0.5) <= 10 / 2 ) &&
												  (Math.pow(Math.pow(pointy, 2), 0.5) <= 5.0 / 2 ) &&
												(Math.pow(Math.pow(pointx, 2), 0.5) >= -10 / 2 ) &&
													 (Math.pow(Math.pow(pointy, 2), 0.5) >= -5.0 / 2);
													
		//Tell user result
		System.out.println("Point (" + pointx + ", " + pointy + ") is " +
			((withinRectangle) ? "in " : "not in ") + "the rectangle");
	
		
	}
}