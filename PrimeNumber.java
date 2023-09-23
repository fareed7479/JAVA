//java program check whether the given number is prime number
//23-09-2023
//PrimeNumber1.java
//SOURCE - JAVAPROGRAMINGQUIZ
public class Main {

  public static void main(String[] args) {

    int num = -17;
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}
