//java program to demonstarte static method
//13-09-2023
//StaticMethodDemo.java
import java.io.*;
class Student
{
    int rollno;
    String name;
    static String college="SITE";//variable -static
    static void change()//method static
    {
        college="SASI";
    }
    Student(String n,int r)
    {
        rollno=r;
        name=n;
    }
    void display()
    {
        System.out.println(rollno+"  "+name+"  "+college);
    }
}
    public class StaticMethodDemo
    {
        public static void main(String args[])
        {
            Student s1 = new Student("FAREED",1);
            Student.change();
            Student s2= new Student("HUSSEN",2);
            System.out.println("Student details are: ");
            s1.display();
            s2.display();
        }
    }
