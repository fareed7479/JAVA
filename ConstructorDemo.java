//java program to demonstrate the usage of default constructor
//30-08-2023
//ConstructorDemo.java
import java.io.*;
import java.util.*;
 class Rectangle{
    int l,b,a;
    Rectangle(){
        l=5;
        b=8;
        a=l*b;
    }
}
public class ConstructorDemo
{
    public static void main(String args[])
    {
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle();
        System.out.println("Area of rectangle 1 "+r1.a);
        System.out.println("Area of rectangle 2 "+r2.a);
    }
}