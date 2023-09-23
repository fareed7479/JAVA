//java program check whether the given number is prime number
//23-09-2023
//PrimeNumber5.java
public class Main {

  public static void main(String[] args) {

    int low=23,high=100;
    for(int i=low;i<=high;i++)
    {
        boolean flag = false;
        for (int j = 2; j <= i / 2; ++j) {
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