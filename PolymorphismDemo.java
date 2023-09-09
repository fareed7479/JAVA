//java prgram to demonstrate abstraction class
//04-09-2023
//PolymorphismDemo.java
import java.io.*;
 class Animal{
    public void animalSound(){
        System.out.println("An animal can make the sound");
    }
}
class Cow extends Animal{
    public void animalSound(){
        System.out.println("The COw sounds 'MAAA'");
    }
}

class Cat extends Animal{
    public void animalSound(){
        System.out.println("The Cat says 'Meow'");
    }
}
public class PolymorphismDemo{
    public static void main(String args[])
    {
        Animal myanimal = new Animal();
        Animal mycow = new Cow();
        Animal mycat = new Cat();
        myanimal.animalSound();
        mycow.animalSound();
        mycat.animalSound();
    }
}