package com.Training.Arithmatic;
import java.util.Scanner;
public class SimpleCal {
	
       public static void main(String[] args) {  
    	   double result;
    	   
    	   //Creating Scanner object
    	   Scanner s = new Scanner(System.in);
    	   
    	   //taking the input from user
    	   System.out.println("enter first the number");
    	   double num1 = s.nextDouble();
   
    	   //selecting the operator
    	   System.out.println("choose the operator +, -, *, or /");
    	   char choice = s.next().charAt(0);
    	   
    	   System.out.println("enter second the number");
    	   double num2 = s.nextDouble();
    	   switch (choice)
    	   {
    	   case '+': 
    		   result = num1 + num2;
    		   System.out.println(num1+" + "+num2+ " = "+result);
    		   break;
    	      
    	   case '-' :
    		   result = num1 - num2;
    		   System.out.println(num1+" - "+num2+ " = "+result);
    		   break;
    		   
    	   case '*' :
    		   result = num1 * num2;
    		   System.out.println(num1+" * "+num2+ " = "+result);
    		   break;
    		   
    	   case '/' :
    		   result = num1 / num2;
    		   System.out.println(num1+" / "+num2+ " = "+result);
    		   break;
    		   
    	    default : System.out.println("Invalid operator....!");
    	    break;
    	    
    	   }	  	   
	}
}
