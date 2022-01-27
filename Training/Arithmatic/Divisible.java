package com.Training.Arithmatic;
import java.util.Scanner;
public class Divisible {
	
	
	public static void main(String[] args) {
		
		//creating Scanner object
		Scanner s = new Scanner(System.in);
		
		//Taking the input from user
		System.out.println("Enter the number");
		int a=s.nextInt();
		
		//Checking the given number is divisible by 5 or not
		
		if(a%5==0)
		{
			System.out.println("the number is completely divisible by 5");
		}
		else {
			System.out.println("the number is not divisible by 5");
		}
	}

}
