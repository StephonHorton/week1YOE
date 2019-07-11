package pairProgram;

import java.util.Scanner;

public class shlong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int den = 0;
		int m = 2020;
		long o = 2019;
		double n = 3.1;
		boolean e = true;
		   float  y = 2.14f;
		String team = "";
		String name = "";
		Scanner user = new Scanner(System.in);
		
		System.out.println("What is your name?");
		name = user.next();
		System.out.println("What is your favorite color?");
		team = user.next();
		System.out.println("How many siblings do you have?");
		den = user.nextInt();
		System.out.println(name + " favorite color is  "+ team +" and she has " +
				den + " siblings."		);
		
		user.close();
		
		
		
		

	}

}
