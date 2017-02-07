/**
 * file: Problem 4_25
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, February 7th, 2017
 * version: 0.1
 *
 * This file contains the methodology for a program that generates 
 * a random 7 digit vehicle plate number beginning with three upper case
 * letters, followed by 4 numeric digits.
 */


public class Problem4_25 {
  public static void main(String[] args){

    // Generates ASCII value that code for either capitalized letters 
    // or the numbers 1 through 9.
    int plateLetter1 = (int)(26 * Math.random()) + 65;
    int plateLetter2 = (int)(26 * Math.random()) + 65; 
    int plateLetter3 = (int)(26 * Math.random()) + 65;

    int plateNumber1 = (int)(10 * Math.random()) + 48;
    int plateNumber2 = (int)(10 * Math.random()) + 48;
    int plateNumber3 = (int)(10 * Math.random()) + 48;
    int plateNumber4 = (int)(10 * Math.random()) + 48;

    // Convert from ASCII to characters
    char pL1 = (char)plateLetter1;
    char pL2 = (char)plateLetter2;
    char pL3 = (char)plateLetter3;

    char pN1 = (char)plateNumber1;
    char pN2 = (char)plateNumber2;
    char pN3 = (char)plateNumber3;
    char pN4 = (char)plateNumber4;

    //Outputting the generated liscence plate number
    System.out.println("The random vehicle plate number is " + pL1 + pL2 + pL3 + "-" 
      + pN1 + pN2 + pN3 +pN4);
  }
}