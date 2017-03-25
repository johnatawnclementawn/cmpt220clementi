/**
 * file: Problem 7.20
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, March 28 2017
 * version: 0.1
 *
 * This file contains the methodology for the selection sort
 * algorithim that sorts from the maximum to the minimum.
 */

import java.util.Scanner;
import java.util.Arrays;

public class Problem7_20 {
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);

    System.out.println("Enter ten numbers: ");
    // Initialize an 10 element array 
    double[] numArray = new double [10];

    // This block with take the user input and place it into the numArray array
    for (int i = 0; i < numArray.length; i++){
      numArray[i] = input.nextInt();
    }

    selectionSort(numArray);

    System.out.println("Here are the sorted numbers: " + Arrays.toString(numArray));
  }

  /**
   * selectionSort
   *
   * This function contains the selection sort algorithm that sorts
   * from the maximum to the minimum.
   *
   * Parameters:
   *   A - array of user inputed numbers to be sorted
   *
   * Return value: 
   */
 public static void selectionSort(double[] list) { 
    for (int i = 0; i < list.length - 1; i++) {

      // Find the minimum in the list[i..list.length-1]
      double currentMax = list[i]; 
      int currentMaxIndex = i;

      for (int j = i + 1; j < list.length; j++) { 
        if (currentMax < list[j]) {
          currentMax = list[j];
          currentMaxIndex = j;
        }
      }

      // Swap list[i] with list[currentMinIndex] if necessary
      if (currentMaxIndex != i) {
        list[currentMaxIndex] = list[i];
        list [i] = currentMax;
      }
    }
  }
}
