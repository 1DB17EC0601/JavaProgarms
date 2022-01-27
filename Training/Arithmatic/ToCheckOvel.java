package com.Training.Arithmatic;
import java.util.Scanner;

public class ToCheckOvel {
	
      public static void main(String[] args) {
		
    	  //create a scanner object
    	  Scanner s = new Scanner(System.in);
    	  
    	  //Taking input from user
    	  System.out.println("Enter the charecter");
    	  char t = s.next().charAt(0); 
    	  
    	  if(t=='a' || t=='e' || t=='i' || t=='o' || t=='u'
          || t=='A' || t=='E' || t=='I' || t=='O' || t=='U' )
    	  {
    		  System.out.println("The given charecter is ovel");
    		  
    	  }
    	  else {
    		  System.out.println("The given char is not ovel");
    	  }
	}	

}
