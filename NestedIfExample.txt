//java program to demonstrate nested if
//26-08-2023
//NestedIfExample.java

import java.io.*;
import java.util.*;
public class NestedIfExample
{
	public static void main(String args[])
	{
		int m1,m2,m3;
				System.out.println("Enter marks of three subjects");
		Scanner sc=new Scanner(System.in);
		 m1=sc.nextInt();
		 m2=sc.nextInt();
		 m3=sc.nextInt();
		int total=m1+m2+m3;
		float AVG=(float)total/3;
		if(AVG>=75)
		{
			if(AVG>=95)
			{
				System.out.println("Congratulations you are in the TOP 5%");
			}
			else if(AVG>=90)
			{
				System.out.println("Congratulations you are in the TOP 10%");
			}
			else
			{
				System.out.println("Student passed in distinction");
			}
		}
		else if(AVG>=60&&AVG<75)
		{
			System.out.println("Student passed in FIRST CLASS");
		}
		else if(AVG>=50&&AVG<60)
		{
			System.out.println("Student passed in SECOND CLASS");
		}
		else if(AVG>=40&&AVG<50)
		{
			System.out.println("Student passed in THIRD CLASS");
		}
		else
		{
			System.out.println("Student FAILED IN THE EXAM");
		}
	}
}