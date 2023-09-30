//java program to demonstarte static variable
//12-09-2023
//StaticVariable.java
import java.io.*;
class Student
{
    int rollno;
    String name;
    static String college="SITE";
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
public class StaticVariableDemo
{
    public static void main(String args[])
    {
        Student s1 = new Student("FAREED",1);
        Student s2= new Student("HUSSEN",2);
        System.out.println("Stuident details are: ");
        s1.display();
        s2.display();
    }
}



/*OUTPUT:
Stuident details are: 
1  FAREED  SITE
2  HUSSEN  SITE*/
