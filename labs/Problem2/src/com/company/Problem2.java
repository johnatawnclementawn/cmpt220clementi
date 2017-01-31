/**
 * file: Problem2
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, February 1st, 2017
 * version: 0.1
 *
 * This file contains the main method for converting from
 * Celsius to Fahrenheit.
 */

import java.util.Scanner;

public class Problem2 {
  public static void main(String[] args){
    double celsius = 0.0;
    double fahrenheit = 0.0;
    System.out.println("Enter a degree in Celsius: ");
    Scanner input = new Scanner (System.in);
    celsius = input.nextDouble();
    fahrenheit = ((9.0/5.0) * celsius) + 32.0; 
    System.out.println(celsius + " degrees Celsius is " 
      + fahrenheit + " degrees Fahrenheit.");
  }
}
