/**
 * file: Question 2
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, February 1st, 2017
 * version: 0.1
 *
 * This file contains the main method for calculating a gratuity
 * and adding it to the subtotal of a bill to get a total bill.
 */

import java.util.Scanner;

public class Question2 {
  public static void main(String[] args){

     Scanner input = new Scanner (System.in);

    double hmlabs = 0.0;
    double prjcs = 0.0;
    double midterm = 0.0;
    double finalExam = 0.0;

    System.out.println("Please enter the following as a percentage... ");

    do {
      System.out.println("Enter a number that is between 0 and 1000: ");
      midterm = input.nextDouble();
    }  while (midterm < 0 || midterm > 1000);  
    
    //Calculates value of individual digits
    int digitFirst = digit / 1000;
    int digitSecond = (digit % 1000) / 100;
    int digitThird = (digit % 100) / 10;
    int digitFourth = digit % 10;
    
    // Calculates sum of digits
    total = digitFirst + digitSecond + digitThird + digitFourth;

    System.out.println("The sum of the digits is: " + total);
  }
}