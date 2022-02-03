package com.capgemini.exceptions;

import java.util.*;

class OnlyOddNumberAllowed extends Exception
{
	public OnlyOddNumberAllowed(String msg)
	{
		super(msg);
	}
}
public class CustomExceptionCreation 
{
	public static void main(String [] args) throws OnlyOddNumberAllowed
	{
		System.out.println("Enter an odd number");
		Scanner s=new Scanner(System.in);
	    int a =s.nextInt();
	    if(a%2 != 0)
	    {
	    	System.out.println(a);
	    }
	    else
	    {
	    	throw new OnlyOddNumberAllowed("Only Odd numbers are allowed");	
	    }
	}
}
