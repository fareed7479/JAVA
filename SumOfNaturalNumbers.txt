//java program to find the sum of n natural numbers
//26-08-2023
//SumOfNaturalNumbers.java

import java.io.*;
import java.util.*;
public class SumOfNaturalNumbers
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value of Integers:");
		int sum=0;
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("The Sum of "+n+" Natural Numbers is "+sum);
	}
}