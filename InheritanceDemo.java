//java prgram to demonstrate inheritan
//02-09-2023
//InheritanceDemo.java
import java.io.*;
class Animal{
    String Name;
    public void eat()
    {
        System.out.println("i can Eat");
    }
}
class JerryMouse extends Animal{
    public void display(){
        System.out.println("My name is "+Name);
    }
}
public class InheritanceDemo{
    public static void main(String args[]){
        JerryMouse jm = new JerrryMouse();
        jm.Name="Jerry-The Mouse";
        jm.display();
        jm.eat();
    }
}