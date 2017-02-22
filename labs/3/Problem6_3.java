/**
 * file: Problem 6.3
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, February 21, 2017
 * version: 0.1
 *
 * This file contains the program that determines if a user inputed integer is a
 * palindrome (such that if reversed, the reverse is equal to the original number)
 */

import java.util.Scanner;

public class Problem6_3 {
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    // User input in the form of a integer as required by the prompt 
    System.out.println("Please enter an integer ");
    int num = input.nextInt();
    
    // Evaluates boolean value from isPalindrome method and prints the result
    if(isPalindrome(num)){
      System.out.println("The integer you have entered, " + num + " is a palindrome!");
    } else { 
      System.out.println("The integer you have entered, " + num + " is not a palindrome.");
    }
  }

  /**
   * isPalindrome
   *
   * This function will test the reversed number to see if the number is
   * indeed a palindrome
   * Parameters:
   *   number: the reversed number
   *
   * Return value: True or false for the if statement in the main method.
   */
  public static boolean isPalindrome(int num){

    //Run the backwords int through the reverse method
    int reverse = reverse(num);

    // Determines if the number is a palindrome or not
    if(num == reverse){
      return true;
    } else {
        return false;
    }
  }

  /**
   * Reverse
   *
   * This function reverses the user inputed integer which will be evaluated later
   * to see if it a palindrome.
   * Parameters:
   *   number: the number entered by the user
   *
   * Return value: The reversed input.
   */
  public static int reverse(int num){
   
    int reverse = 0;

    //Reverses the input
    while(num != 0){
      reverse = (reverse * 10) + (num % 10);
      num = num / 10;
    }

    // Returns absolute value of reverse so that negatives are not considered
    return Math.abs(reverse);
  }
}