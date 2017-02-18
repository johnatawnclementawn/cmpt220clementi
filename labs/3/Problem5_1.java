/**
 * file: Problem 5.1
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, February 21, 2017
 * version: 0.1
 *
 * This file contains the methodology for a program that counts the 
 * number of positive and negative numbers in a user inputed series of
 * integers and calculates the sum and average of those numbers.
 */

import java.util.Scanner;

public class Problem5_1 {
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
      int num = 0;
      int pos = 0;
      int neg = 0;
      double tot = 0.0;
      double avg = 0.0;
      int avgCount = 0;

      // Prompts user for integers and terminates input when the series ends in a 0.
      System.out.println("Enter a series of integers, the series ends if ends in 0");


      // Function checks for terminating value, completes actions if non-zero input
      do {
        num = input.nextInt();

        if (num > 0) {
          pos++;
        }

        else if (num < 0) {
          neg++;
        }

        // Calculates the sum of the numbers 
        tot = tot + num;

        if (num != 0) {
          // Counts the numbers inputed, used for calculating the average.
          avgCount++;
          // Calcuate the average
          avg = tot / avgCount;
        }

      } while (num != 0);

      // Output statistics of inputed integers
      System.out.println("The number of positives is: " + pos);
      System.out.println("The number of negatives is: " + neg);
      System.out.println("The number of total is: " + tot);
      System.out.println("The number of average is: " + avg);

    }
}