package com.Training.Arithmatic;
import java.util.Scanner;
public class EvenNum {
	
	public static void main(String[] args) {
		//creating the scanner object
		
		Scanner scn = new Scanner(System.in);
		
		//taking the input from user
		
		System.out.println("Enter the num to check even or odd");
		
		int num = scn.nextInt();
		
		if(num%2==0)
		{
			System.out.println("the given num is even");
		}
		else
		{
			System.out.println("The given num is odd");
		}
	}

}
