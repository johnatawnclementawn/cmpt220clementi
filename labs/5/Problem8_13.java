/**
 * file: Problem 8.13
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, March 28 2017
 * version: 0.1
 *
 * This file contains the methodology that finds the location of the largest value 
 * in a matrix
 */

import java.util.Scanner;
import java.util.Arrays;

public class Problem8_13 {
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);

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

    int largestLoc[] = locateLargest(matrix);

    System.out.println("The location of the largest element: (" + largestLoc[0] + 
        ", " + largestLoc[1] + ")");
  }

  /**
   * locateLargest
   *
   * This function evaluates the 
   *
   * Parameters:
   *   matrix - two dimensional array
   *
   * Return value: loc (coordinates of the largest value)
   */
  public static int[] locateLargest(double[][] a){
    int[] loc = {0,0};
    double min = 0;

    // For statements move through the array in this order:
    // Row 1 (column 1,2,3,4,etc)
    // Row 2 (column 1,2,3,4,etc) etc
    for(int i = 0; i < a.length; i++){
      for(int j = 0; j < a[0].length; j++){
        // If the current min is less than the locatio being evaluated, 
        // set the current location to the min value
        if (min < a[i][j]){
          loc[0] = i;
          loc[1] = j;
          min = a[i][j];
        }
      }
    }
  return loc;
  }
}
