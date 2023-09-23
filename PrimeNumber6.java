//java program check whether the given number is prime number by users Input
//23-09-2023
//PrimeNumber6.java
import java.io.*;
import java.util.*;
public class Main {

  public static void main(String[] args) {

    int low,high;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the lower boundary: ");
    low=sc.nextInt();
    System.out.println("Enter the higher boundary: ");
    high=sc.nextInt();
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
        else
            System.out.println(i + " is not a prime number.");
    }
  }
}