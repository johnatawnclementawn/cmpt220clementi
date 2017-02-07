/**
 * file: Problem 4.5
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, February 7th, 2017
 * version: 0.1
 *
 * This file contains the methodology for a program that 
 * calculates the area of a regular polygon based on a user
 * inputed number of sides and length of those sides.
 */

import java.util.Scanner;

public class Problem4_5 {
  public static void main(String[] args){

  Scanner input = new Scanner (System.in);

  int numSide = 0;
  double sideLength = 0.0;
  double area = 0.0;

  do { 
    System.out.println("Enter the number of sides: ");
    numSide = input.nextInt();
  } while (numSide < 0.1);
    
  do {
    System.out.println("Enter the length of the sides: ");
    sideLength = input.nextDouble();
  } while (sideLength < 0.1);

  area = ((numSide * (Math.pow(sideLength, 2))) / (4 * (Math.tan(Math.PI / numSide))));

  System.out.println("The area of the polygon is: " + area);
  }
}