/**
 * file: Problem 7.9
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, March 8 2017
 * version: 0.1
 *
 * This file contains the methodology for a program that determines 
 * the smallest number in a user inputed array of 10 doubles
 */

import java.util.Scanner;

public class Problem7_9 {
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);

    System.out.println("Enter ten numbers (include 1 decimal place): ");
    // Initialize an 10 element array 
    double[] numArray = new double [10];

    // This block with take the user input and place it into the numArray array
    for (int i = 0; i < numArray.length; i++){
      numArray[i] = input.nextDouble();
    }
    
    System.out.println("The smallest number in that string is " + min(numArray));
  }

  /**
   * min
   *
   * This function will find the smallest element in an array of doubles
   *
   * Parameters:
   *   numArray - array of user inputed numbers to be evaluated
   *
   * Return value: minNum, the smallest number in the user inputed array
   */
  public static double min(double[] array){
    double minNum = array[0]; 

    for (double i: array) {
      if (i < minNum){
        minNum = i;
      }
    }
    return minNum;
  }
}