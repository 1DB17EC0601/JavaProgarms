package com.Typecasting;

public class Narrowingg {
	
	public static void main(String[] args)
	{
		//widening happens implicitly
	int x=10;
	double y=43.98;
	char q ='x';
	byte a=10;
	System.out.println(x+" \n"+y);
	
	double s=x;
	int o =a;
	double w= q;
	System.out.println(s+"\n" +o+ "\n "+w);
	
	
      //narrowing happens explicitly
	
	double e= 34.65;
	long r= 29103983911l;
	char t= 'd';
	
	
	int y1 =(int)e;
	byte u=(byte)r;
	short i =(short)t;
	long p= (long) y;
	System.out.println(y1+"\n "+u+" \n"+i+"\n "+p);
	
	}	

}
