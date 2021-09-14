package org.example;


import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 hudson millar
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
