package com.company;

import java.util.Scanner;

public class PairProcess {
    public static void main(String[] args) {
        int num1, num2;

        Scanner keyboard = new Scanner(System.in);

        System.out.print( "First Number? :" );
        num1 = keyboard.nextInt();

        System.out.print( "Last Number?  :" );
        num2 = keyboard.nextInt();
        int sum= num1 + num2;
        int product=num1*num2;
        int average=(num1+num2)/2;
       if (sum>=200) {
           System.out.println("The sum is :" + sum + " * ");
           System.out.println("The product is:" + product);
           System.out.println("The Average is:" + average);
       }
       else
       {
           System.out.println("The sum is :" + sum );
           System.out.println("The product is:" + product);
           System.out.println("The Average is:" + average);
       }

    }
}