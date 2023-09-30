//java program to demonstarte static variable by using with help of COUNT
//12-09-2023
//StaticVariableDemo2.java
import java.io.*;
class CounterDemo
{
    static int count=0;
    void counterDemo()
    {
        count++;
        System.out.println(count);
    }
}
public class StaticVariableDemo2
{
    public static void main(String args[])
    {
        CounterDemo cd=new CounterDemo();
        CounterDemo cd2=new CounterDemo();
        CounterDemo cd3=new CounterDemo();
        System.out.println("No of objects created is "+count);
    }
}
