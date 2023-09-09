//java prgram to demonstrate Interface
//04-09-2023
//InterfaceDemo.java
import java.io.*;
interface Language{
    void getName(String name);
}
class ProgrammingLanguage implements Language{
    public void getName(String name){
        System.out.println("MY FAVOURITE PROGRAMMING LANGUAGE IS "+name);
    }
}
public class InterfaceDemo{
    public static void main(String args[]){
        ProgrammingLanguage pl = new ProgrammingLanguage();
        pl.getName("C programming");
    }
}