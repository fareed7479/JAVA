//java program to demonstrate the usage of parametirised constructor
//30-08-2023
//ParametirisedConstructor.java
import java.io.*;
class Rectangle{
    Rectangle(int l,int b){
        int a;
        a=l*b;
    }
}
public class ParametrisedConstructor{
    public static void main(String args[]){
        Rectangle r = new Rectangle(5,8);
        System.out.println("Area of Rectangle "+ r.a);
    }
}