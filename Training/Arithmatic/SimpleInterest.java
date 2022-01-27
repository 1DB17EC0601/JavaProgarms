package com.Training.Arithmatic;
import java.util.Scanner;
public class SimpleInterest {
         public static double interest(double p, int t, int r)
         {
        	 System.out.println("the interest method is running");
        	 System.out.println();
        	 return (p*t*r)/100;
         }
         
         
         public static void main(String[] a)
         {
        	 //create scanner object
        	 Scanner s=new  Scanner(System.in);
        	 System.out.println("enter the principle amount");
        	double p=s.nextDouble();
        	 System.out.println("enter the time period in months amount");
        	 int t =s.nextInt();
        	 System.out.println("enter the rate of interest");
        	 int r=s.nextInt();
        	 
        	 double result=SimpleInterest.interest(p, t, r);
        	 
        	System.out.println("the total interest for given principle amount is "+result);
         }
}
