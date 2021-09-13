package org.example;


import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("What's your name?");

        String userName = myObj.nextLine();
        System.out.println("Sup, "+ userName);

    }
}
