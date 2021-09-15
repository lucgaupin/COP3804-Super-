/*********************************************************************
 Author    : Luc Gaupin 
 Course    : COP 3804
 Professor : Michael Robinson 
 Program # : Program Purpose/Description 
             { Program to demonstrate the useage of super classes, sub classes, and how they all come together to work together }

 Due Date  : 07/14/2021 


 Certification: 
 I hereby certify that this work is my own and none of it is the work of any other person. 

 ..........{ Luc Gaupin }..........
*********************************************************************/
import java.util.*;
import java.awt.*;

public class gaupinLPgm3
{
    static gaupinLSuperPgm3 displaySuper = new gaupinLSuperPgm3();
    static gaupinLSub1 displaySubOne = new gaupinLSub1();
    static gaupinLSub2 displaySubTwo = new gaupinLSub2();

    public static void displaySuperClass()
    {
        displaySuper.methodTwo();
        displaySuper.methodThree();
    }


    public static void displaySub1()
    {
        displaySubOne.methodTwo();
        displaySubOne.methodThree();
    }


    public static void displaySub2()
    {
        displaySubTwo.methodThree();
    }


    public static void main ( String[] args )
    {
        String stringOne = "1) Displaying the methods in the gaupinLSuperPgm3 Class";
        String stringTwo = "2) Displaying the methods in the gaupinLSub1 Class";
        String stringThree = "3) Displaying the methods in the gaupinLSub2 Class";

        System.out.printf( "\n%s", stringOne );
        displaySuperClass();
        System.out.printf( "\n%s", stringTwo );
        displaySub1();
        System.out.printf( "\n%s", stringThree );
        displaySub2();
    }
}