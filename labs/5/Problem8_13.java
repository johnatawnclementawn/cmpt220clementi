/**
 * file: Problem 7.20
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, March 28 2017
 * version: 0.1
 *
 * This file contains the methodology that merges two pre-sorted arrays.
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
   * merge
   *
   * This function contains the selection sort algorithm that merges two lists of
   * already sorted numbers
   *
   * Parameters:
   *   list1 - array of user inputed numbers to be sorted
   *   list2 - array of user inputed numbers to be sorted
   *
   * Return value: mergeList (the merged and sorted array)
   */
  public static int[] locateLargest(double[][] a){
    int[] loc = {0,0};
    double min = 0;

    // 
    for(int i = 0; i < a.length; i++){
      for(int j = 0; j < a[0].length; j++){
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
