/*
Author: Cole Buehler
Date: 10/26/2018

Create program to calaulate area of a pentagon
*/
import java.util.Scanner;

class Ex_4_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the distance from the center to the vertex: ");
		double r = input.nextDouble();
		
		double s = 2 * r * Math.sin(Math.PI / 5);
		
		double area = 5 * s * s / (4 * Math.tan(Math.PI / 5));
		
		System.out.println("The area of the pentagon is: " + area);
		
	}
}