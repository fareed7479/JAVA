//java program check whether the given number is prime number by CMD
//23-09-2023
//PrimeNumber7.java
import java.io.*;
import java.util.*;
public class Main {
    static
    {
        System.out.println("Enter the two boundary Limits for Prime Numbers In CMD : ");
    }
  public static void main(String[] args) 
  {
    int low,high;
    low=Integer.parseInt(args[0]);
    high=Integer.parseInt(args[1]);
    System.out.println("The prime numbers between "+low+" and "+high+" is : ");
    for(int i=low;i<=high;i++)
    {
        boolean flag = false;
        for (int j = 2; j <= i / 2; ++j)
        {
          // condition for nonprime number
          if (i % j == 0) 
          {
            flag = true;
            break;
            }
        }
        if (!flag)
            System.out.println(i + " is a prime number.");
    }
  }
}