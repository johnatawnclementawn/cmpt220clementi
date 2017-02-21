/**
 * file: Problem 5.13
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, February 21, 2017
 * version: 0.1
 *
 * This file contains the methodology for a program that calculates the smallest
 * number such that its cube is less than 12,000.
 */

public class Problem5_13 {
  public static void main(String[] args){

    double n = Math.cbrt(12000);

    while (n < 23){
      n = (int) Math.floor(n);
      System.out.printf("%.0f",n);
      System.out.print(" is smallest whole number whose square is greater than 12,000.");
    break;
    }
  }
}  