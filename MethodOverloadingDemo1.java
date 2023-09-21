//java program to demonstarte the method overloading
//08-09-2023
//MethodOverloadingDemo1.java
import java.io.*;
 class Adder{
    int add(int a,int b)
    {
        return a+b;
    }
    int add(int a,int b,int c)
    {
        return a+b+c;
    }
    int add(int a)
    {
        return 0+a;
    }
}
public class MethodverLoadingDemo1{
    public static void main(String args[])
    {
        Adder ad= new Adder();
        int x = ad.add(5);
        int y = ad.add(10,20);
        int z = ad.add(x,y,0);
        System.out.println("VAlue of x is "+x);
        System.out.println("VAlue of y is "+y);
        System.out.println("VAlue of z is "+z);
        
    }
}
