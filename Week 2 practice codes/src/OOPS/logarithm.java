package OOPS;

import java.util.Scanner;

public class logarithm {

	public static void main(String[] args) {
		String reset;
		double input, base;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Logarithm calculator\nEnter the base value : ");
			base = s.nextDouble();
			System.out.println("Enter the value :");
			input = s.nextDouble();
			if(input != 0) System.out.println("log " + input + " to the base " + base + " = " + (Math.log(input) / Math.log(base)));
			System.out.println("Do you want to reset? ");
			reset = s.next();
			System.out.println(System.currentTimeMillis());
		} while (reset.toUpperCase().equals("Y"));
		s.close();
	}

}
