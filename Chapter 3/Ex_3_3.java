		/*
		Author: Cole Buehler
		Date: 10/15/2018
		
		Uses Cramer's Rule to solve linear expressions
		*/
		
		import java.util.Scanner;

		class Ex_3_3 {
			public static void main(String[] args) {
				
				Scanner in = new Scanner(System.in);
				
				// Prompt the user
				System.out.println("We are going to solve a linear expression using cramer's rule");
				System.out.print ("Enter a, b, c, d, e, f: (Seperated using spaces) ");
				
				// Declare variables
				double a = in.nextDouble();
				double b = in.nextDouble();
				double c = in.nextDouble();
				double d = in.nextDouble();
				double e = in.nextDouble();
				double f = in.nextDouble();
				
				// Check that denominator is not zero
				if(a*d - b*c == 0){
					System.out.println("The equation has no solution.");
				}else{
					
					// Solve for x and y
					double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
					double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
					
					System.out.printf("x is %.1f and y is %.1f", x, y);
			}
		
	}
}