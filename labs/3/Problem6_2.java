/**
 * file: Problem 6.2
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, February 21, 2017
 * version: 0.1
 *
 * This file contains the program that
 */

import java.util.Scanner;

public class Problem6_2 {
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    // User input in the form of a long as required by the prompt 
    System.out.println("Please enter an integer ");
    long num = input.nextLong();
    
    // Calls sumDigits method, and passes num through the method
    int sum = sumDigits(num);


    System.out.println("The sum of digis is: " + sum);
  }

  // This method checks for a proper user input and extracts the digits to be added
  public static int sumDigits(long n){
    int sum = 0;
    
    // Repetitively extracts numbers
    while (n != 0){
      sum = sum + (int)(n % 10);
      n = n / 10;
    } 

    return Math.abs(sum); 
  }
}  