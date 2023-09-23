//java program to demonstrate the importance oof THIS keyword
//09-09-2023
//ThisDemo1.java
import java.io.*;
class Student
{
    int rollno;
    String name;
    float fee;
    Student(int rollno,String name,float fee)
    {
        rollno = rollno;
        name = name;
        fee= fee;
    }
    void display(){
        System.out.println("Student details are: ");
        System.out.println(rollno+" "+name+" "+fee);
    }
}
public class ThisDemo1{
    public static void main(String args[])
    {
        Student s1 = new Student(506,"Huseen",2500);
        Student s2 = new Student (500,"YASH",2400);
        System.out.println("Students details are : ");
        s1.display();
        s2.display();
    }
}
/*OUTPUT:-
Student details are: 
0 null 0.0
Student details are: 
0 null 0.0*/
