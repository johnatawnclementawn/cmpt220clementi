/**
 * file: Problem 5.12
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, February 21, 2017
 * version: 0.1
 *
 * This file contains the methodology for a program that calculates the smallest
 * number such that its square is greater than 12,000.
 */

public class Problem5_12 {
  public static void main(String[] args){

    double n = Math.sqrt(12000);

    while (n < 110){
      n = (int) Math.ceil(n);
      System.out.printf("%.0f",n);
      System.out.print(" is smallest number whose square is greater than 12,000.");
    break;
    }
  }
}  