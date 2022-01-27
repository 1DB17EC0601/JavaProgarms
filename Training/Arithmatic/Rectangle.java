package com.Training.Arithmatic;
import java.util.Scanner;
public class Rectangle {
	
	public static double per(double length, double breadth )
	{
		System.out.println("The primeter method is running");
	 double perimeter = 2*(length+breadth);
		return perimeter;
	}
	
	public static void main(String[] args) {
		//creating Scanner object
		Scanner s = new Scanner(System.in);
		
		// taking the input from user
		System.out.println("Enter the length of a triangle");
		double length = s.nextDouble();
		
		System.out.println("Enter the width of triangle ");
		double breadth = s.nextDouble();
		
		System.out.println("The perimeter of the triangle "+Rectangle.per(length, breadth));
	}

}
