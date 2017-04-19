/**
 * file: Problem 9.13
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, April 18th 2017
 * version: 0.1
 *
 * This file contains the methodology that finds the location of the largest value 
 * in a matrix
 */

import java.util.Scanner;
import java.util.Arrays;

public class Problem9_13 {
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);

    // Create location object
    Location location = new Location();

    System.out.println("Enter the number of rows and columns of the array: ");
    int rows = input.nextInt();
    int columns = input.nextInt();

    // Declare the matrix
    double[][] matrix = new double [rows][columns];

    System.out.println("Enter " + matrix.length + " rows and " +
      matrix[0].length + " columns: ");
    
    // Standard block to initialize the matrix
    for (int row = 0; row < matrix.length; row++) {
      for (int column = 0; column < matrix[row].length; column++) { 
        matrix[row][column] = input.nextDouble();
      }
    }  

    // Call Location class to determine the location of the largest variable
    location.locateLargest(matrix);

    System.out.println("The location of the largest element: " + location.maxValue +
       " is at (" + location.row + ", " + location.column + ")");
  }
}
