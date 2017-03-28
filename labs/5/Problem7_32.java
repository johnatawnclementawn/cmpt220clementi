/**
 * file: Problem 7.32
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, March 28 2017
 * version: 0.1
 *
 * This program uses the first number of an array as a "pivot" and then evaluates whether
 * the other values in the array are less than or greater than the pivot, and then displaying 
 * the lessThan numbers + pivot + greaterThan numbers.
 */

import java.util.Scanner;
import java.util.Arrays;

public class Problem7_32 {
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the length of list: ");
    int listLen = input.nextInt();

    System.out.println("Enter the values for list, where the first value is the pivot");
    int[] list = new int [listLen];
    // This block with take the user input and place it into the list
    for (int i = 0; i < listLen; i++){
      list[i] = input.nextInt();
    }
    

    //int[] numArray = partition(list);
    partition(list);

    //System.out.println("Here are the sorted numbers: " + numArray);
  }

  /**
   * partition
   *
   * This function contains the selection sort algorithm that merges two lists of
   * already sorted numbers
   *
   * Parameters:
   *   list - 
   *
   * Return value: newList (string representation of the array)
   */
  public static int[] partition(int[] list){
    // Initialize the first list value as the pivot value
    int pivot = list[0];
    int[] lessThan = new int[list.length];
    int[] greaterThan = new int[list.length];
    int lT = 0; // Index of lessThan array
    int gT = 0; // Index of greaterThan array

    for(int i = 0; i < list.length; i++){
      // If the value of list being evaluated is less than the pivot value, assign it to
      // the lessThan array. If the value is greater than the pivot value, assign it to 
      // the greaterThan array.
      if(pivot >= list[i]){
        lessThan[lT] = list[i];
        lT++; 
      } else if(pivot < list[i]){
        greaterThan[gT] = list[i];
        gT++;
      }
    }

    lT = 0;
    gT = 0;
    // Over-write list with the values from lessThan, pivot, and greaterThan in order
    for(int i = 0; i < list.length; i++){
      if(lessThan[i] != 0){
        list[i] = lessThan[lT];
        lT++;
      } else if (pivot == pivot){
        list[i] = pivot;
      } else if (greaterThan != 0){
        list[i] = greaterThan[gT];
        gT++;
      }
    }
    // Caste lessThan and greaterThan to strings, then concatenate

    // // //String newList = lessThan + pivot + greaterThan;
    // // //System.out.println(newList);
    // // System.out.println(Arrays.toString(lessThan));
    // // System.out.println(Arrays.toString(greaterThan));
    // // System.out.println(pivot);
    // return pivot;
    // //return newList;
    return list;
  }
}