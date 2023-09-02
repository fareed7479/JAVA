//java progarm to find the factorial of a given number
//26-08-2023
//Factorial.java

import java.io.*;
import java.util.*;
public class Factorial
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value to find Factorial:");
		int fact=1;
		int n=sc.nextInt();
		for(int i=1;i<n;i++)
		{
			fact=fact*i;
		}
	System.out.println("Factorial of "+n+" is "+fact);
	}
}