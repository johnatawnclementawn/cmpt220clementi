/**
 * file: Problem 5.1
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, February 21, 2017
 * version: 0.1
 *
 * This file contains the methodology for a program that 
 *
 */

import java.util.Scanner;

public class Problem5_7 {
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    double tuition = 10000.0;
    double totCost = 0.0;

    // For loop 
    for (int i = 0; i < 14; i++) {
      // 
      tuition = (tuition * 1.05);

      // 
      if (i == 9){
        System.out.format("The tuition for the 10th year is: %.2f\n", tuition);
      } else if (i > 9) {
          totCost = (totCost + tuition);
      }
    }
    System.out.format("The total cost of tuition is:  %.2f\n", tuition);
  }  
}