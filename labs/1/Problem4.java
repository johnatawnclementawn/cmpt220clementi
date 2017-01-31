/**
 * file: Problem4
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, February 1st, 2017
 * version: 0.1
 *
 * This file contains the main method for seperating the digits of an
 * integer and then adding them.
 */

import java.util.Scanner;

public class Problem4 {
  public static void main(String[] args){
    int digit = 0;
    int total = 0;

    Scanner input = new Scanner (System.in);

    do {
      System.out.println("Enter a number that is between 0 and 1000: ");
      digit = input.nextInt();
    }  while (digit < 0 || digit > 1000);  
    
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