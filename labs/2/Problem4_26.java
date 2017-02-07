/**
 * file: Problem 4.26
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, February 7th, 2017
 * version: 0.1
 *
 * This file contains the methodology for a program that calculates
 * the number of dollars, quarters, dimes, nickels, and pennies in an user inputed
 * monetary value. It has been fixed to not lose accuracy when converting from float
 * values to integer values.
 */

import java.util.Scanner;

public class Problem4_26 {
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    // Convert input from double value to string value
    System.out.println("Enter an amount in double, for example 11.56: ");   
    String amount = input.nextLine();

    // Dollar and cent strings seperated into two seperate values to be analyzed.
    String dollars = amount.substring(0 , amount.indexOf("."));
    String cents = amount.substring(amount.indexOf(".") + 1, amount.length());

    //Convert each string to an integer
    int numberOfOneDollars = Integer.parseInt(dollars);
    int remainingAmount = Integer.parseInt(cents);

    //Find  the number of quarters in the remaining amount
    int numberOfQuarters = remainingAmount / 25;
    remainingAmount = remainingAmount % 25;

    //Find the number of dimes in the remaining amount
    int numberOfDimes = remainingAmount / 10;
    remainingAmount = remainingAmount % 10;

    //Find the number of nickels in the remaining amount
    int numberOfNickels = remainingAmount / 5;
    remainingAmount = remainingAmount % 5;

    //Find the number of pennies in the remaining amount
    int numberOfPennies = remainingAmount;

    //Display results
    System.out.println("Your amount " + amount + " consists of");
    System.out.println("    " + numberOfOneDollars + " dollars");
    System.out.println("    " + numberOfQuarters + " quarters");
    System.out.println("    " + numberOfDimes + " dimes");
    System.out.println("    " + numberOfNickels + " nickels");
    System.out.println("    " + numberOfPennies + " pennies");
    
  }
}