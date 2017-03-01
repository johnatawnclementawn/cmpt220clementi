/**
 * file: Problem 6.20
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, March 8 2017
 * version: 0.1
 *
 * This file contains the methodology for a program that counts the number
 * of letters in a user inputed string.
 */

import java.util.Scanner;

public class Problem6_20 {
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);

    System.out.println("Input a string of text: ");
    String text = input.nextLine();
    
    System.out.println("The number of letters in that string is " + countLetters(text));
  }

  /**
   * countLetters
   *
   * This function will count the number of letters in a string
   *
   * Parameters:
   *   text: user inputed string
   *
   * Return value: letCount, number of characters
   */
  public static int countLetters(String s){
    
    int letCount = 0;

    // For the length of the string, a counter determines if the character is a letter
    // and counts the number of letters 
    for(int i = 0; i < s.length(); i++){
      if (Character.isLetter(s.charAt(i))){
        letCount++;
      }
    }
    return letCount;
  }
}