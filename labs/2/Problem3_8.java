/**
 * file: Problem 3.8
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, February 7th, 2017
 * version: 0.1
 *
 * This file contains the methodology for a program in which
 * the user is prompted to input 3 integer values.  After the  
 * integers are inputted, the program sorts them into 
 * non-decending order.
 */

import java.util.Scanner;

public class Problem3_8 {
  public static void main(String[] args){

    Scanner input = new Scanner (System.in);
    
    //Random number is generated to correspond to month of the year. 
    int int1 = 0;
    int int2 = 0;
    int int3 = 0;

    System.out.println("Type the first integer value here:");
      int1 = input.nextInt();
    System.out.println("Type the second integer value here:");
      int2 = input.nextInt();
    System.out.println("Type the third integer value here:");
      int3 = input.nextInt();
  
    if (int1 > int2 || int1 > int3 || int2 > int3) {
      System.out.println("The numbers: " + int3 + "," + int2 + "," + int1 +
      " are in non-decending order!");
    }  else if(int2 > int1 || int2 > int3 || int1 > int3) {
         System.out.println("The numbers: " + int3 + "," + int1 + "," + int2 +
         " are in non-decending order!");
    }  else if (int3 > int1 || int3 > int2 || int2 > int1) {
         System.out.println("The numbers: " + int1 + "," + int2 + "," + int3 +
         " are in non-decending order!"); 
    }  else {
         System.out.println("That is an incorrect input");
    }
  }
}