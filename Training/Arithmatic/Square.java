package com.Training.Arithmatic;
import java.util.Scanner;
public class Square {
	
	public static double peri(double p)
	{
		
		double perimeter = 4*p;
		System.out.println("the perimeter of the square is "+perimeter);
		return perimeter;
	}

	public static void main(String[] args) {
		// creating a scanner object
		Scanner sc = new Scanner(System.in);
		
		//take the inputs from user
		System.out.println("Enter the value of suare");
		double p =sc.nextDouble();
		
		Square.peri(p);
		System.out.println(Square.peri(p));
		
	}

}
