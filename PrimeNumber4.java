//java program to display prime number between to numbers
//23-09-2023
//PrimeNumber4.java
import java.io.*;
import java.util.*;
public class Prime 
{
    public static void main(String[] args) 
    {
        int low = 23, high = 97;
        while (low <= high) 
        {
            boolean flag = false;
            for(int i = 2; i <= low/2; ++i) 
            {
                // condition for nonprime number
                if(low % i == 0) 
                {
                    flag = true;
                    break;
                }
            }
            if (!flag && low != 0 && low != 1)
                System.out.print(low + " ");
            ++low;
        }
    }
}