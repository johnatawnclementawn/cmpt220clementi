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

public class Problem7_31 {
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);

    System.out.println("Enter list1 where the first number is the length of the array: ");
    int list1Len = input.nextInt();
    int[] list1 = new int [list1Len];

    // This block with take the user input and place it into the list1
    for (int i = 0; i < list1Len; i++){
      list1[i] = input.nextInt();
    }

    System.out.println("Enter list2 where the first number is the length of the array: ");
    int list2Len = input.nextInt();
    int[] list2 = new int [list2Len];

    // This block with take the user input and place it into the list2
    for (int i = 0; i < list2Len; i++){
      list2[i] = input.nextInt();
    }

    int numArray[] = merge(list1,list2);

    System.out.println("Here are the sorted numbers: " + Arrays.toString(numArray));
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
  public static int[] merge(int[] list1, int[] list2) { 
    // Create a new list to catch the sorted and merged list
    int[] mergeList = new int [list1.length + list2.length];
    int i = 0; // i is the index of list1
    int j = 0; // j is the index of list2

    for(int k = 0; k < mergeList.length; k++){
      
      // To check for out of bounds, evaluate if location i is greater than the length of list1
      if(i == list1.length){
        // Assign the remainder of list2 to mergeList
        for (int q = k; j < list2.length; q++){
          mergeList[q] = list2[j];
          j++;
        }
        return mergeList;

      // To check for out of bounds, evaluate if location j is greater than the length of list2
      } else if (j == list2.length){
        // Assign the remainder of list1 to the mergeList
        for (int q = k; i < list1.length; q++){
          mergeList[q] = list1[i];
          i++;
        } 
        return mergeList;
      }

      // If the current number in list1 is greater than its counterpart
      // in list 2, it is stored in the mergeList array
      if (list1[i] <= list2[j]){
        mergeList[k] = list1[i];
        i++;
      } else {
        mergeList[k] = list2[j];
        j++;
      }
    }
  return mergeList;
  }
}
