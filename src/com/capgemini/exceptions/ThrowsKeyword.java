package com.capgemini.exceptions;

import java.io.*;

class FNFException {

	public void print() throws FileNotFoundException
	{
		FileInputStream f = new FileInputStream("c:\\sakthi.pdf");
	}
}
public class ThrowsKeyword 
{
	public static void main(String [] args)
	{
		try
		{
			FNFException a = new FNFException();
			 a.print();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Enter a valid file path");
		}
		catch(Exception e)
		{
			System.out.println("Exception found");
		}
	}
}
