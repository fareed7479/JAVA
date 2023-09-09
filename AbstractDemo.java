//java prgram to demonstrate abstraction class
//04-09-2023
//AbstractionDemo.java
import java.io.*;
abstract class Animal{
    public abstract void animalSound();
    public void eat(){
        System.out.println("I CAN EAT");
    }
}
class Cow extends Animal{
    public void animalSound(){
        System.out.println("The COw sounds 'MAAA'");
    }
}
public class AbstractDemo{
    public static void main(String args[])
    {
        Cow c = new Cow();
        c.animalSound();
        c.eat();
    }
}