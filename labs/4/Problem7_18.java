/**
 * file: Problem 7.18
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, March 8 2017
 * version: 0.1
 *
 * This file contains the methodology 
 */

import java.util.Scanner;
import java.util.Arrays;

public class Problem7_18 {
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);

    System.out.println("Enter ten numbers: ");
    // Initialize an 10 element array 
    int[] numArray = new int [10];

    // This block with take the user input and place it into the numArray array
    for (int i = 0; i < numArray.length; i++){
      numArray[i] = input.nextInt();
    }

    bubbleSort(numArray);

    System.out.println("Here are the sorted numbers: " + Arrays.toString(numArray));
  }

  /**
   * bubbleSort
   *
   * This function contains the bubble sort algorithm 
   *
   * Parameters:
   *   A - array of user inputed numbers to be sorted
   *
   * Return value: 
   */
  public static int[] bubbleSort (int A[]){
    int n = A.length;

    for (int k = n - 1; k > 0; k--){

      for (int i = 0; i < k; i++){

        if (A[i] > A[i + 1])
          swap (A, i, i + 1);
      }
    }
    return A;
  }

  /**
   * swap
   *
   * This function switches the order of the numbers of an array
   *
   * Parameters:
   *   A - array of user inputed numbers to be sorted
   *
   * Return value: temp
   */
  public static void swap (int[] A, int i, int j){
    int temp = A[i];

    A[i] = A[j];

    A[j] = temp;
  }
}