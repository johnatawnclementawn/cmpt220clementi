/**
 * file: Problem3
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, February 1st, 2017
 * version: 0.1
 *
 * This file contains the main method for calculating a gratuity
 * and adding it to the subtotal of a bill to get a total bill.
 */

import java.util.Scanner;

public class Problem3 {
  public static void main(String[] args){
    double subtot = 0.0;
    double grat = 0.0;
    double gratrate = 0.0;
    double total = 0.0;

    Scanner input = new Scanner (System.in);

    //Subtotal calculator: This do while loop prevents the user from 
    //inputing a negative number, which would create a logic error.
    do {
      System.out.println("Enter a subtotal of the bill: ");
      subtot = input.nextDouble();
    }  while (subtot < 0);  

    //Gratuity rate calculator: This do while loop prevents the user from 
    //inputing a negative number, which would create a logic error.     
    do { 
      System.out.println("Enter a gratuity rate: ");
      gratrate = input.nextDouble();
    }  while (gratrate < 0);

    //Gratuity calculator
    grat = subtot * (gratrate/100);

    //Total calculator
    total = grat + subtot;

    System.out.println("The gratuity is: $" + grat 
      + " and the total is: $" + total);
  }
}