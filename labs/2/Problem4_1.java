/**
 * file: Problem 4.1
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, February 7th, 2017
 * version: 0.1
 *
 * This file contains the methodology for a program that randomly 
 * generates a number between 1 and 12, which displays the month
 * of the year which that number corresponds to.
 */

import java.util.Scanner;

public class Problem4_1 {
  public static void main(String[] args){

  Scanner input = new Scanner (System.in);

  double side = 0.0;
  double middleLength = 0.0;
  double area = 0.0;

  // Check for negative values
  do {
    System.out.println("Enter the length of a line from the center point of a pentagon to an outer vertex: ");
    middleLength = input.nextDouble();
  }  while (middleLength < 0);
  
  // Calculate length of sides of pentagon
  side = ((2 * middleLength) * (Math.sin(Math.PI / 5)));
  
  // Calculate area of a pentagon
  area = (5 * (Math.pow(side, 2)) / (4 * (Math.tan(Math.PI / 5))));

  System.out.println("The area of the pentagon is: " + area);
  }
}