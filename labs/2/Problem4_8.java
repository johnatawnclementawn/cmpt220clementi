/**
 * file: Problem 4.8
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, February 7th, 2017
 * version: 0.1
 *
 * This file contains the methodology for a program that 
 * 
 *
 */

import java.util.Scanner;

public class Problem4_8 {
  public static void main(String[] args){

    Scanner input = new Scanner (System.in);

    int asciiCode = 0;
    char letter;

    do {
    System.out.println("Enter your Ascii Code value: ");
      asciiCode = input.nextInt();
    } while (asciiCode < 0 || asciiCode > 127);

    // Converts ascii code to character values
    letter = (char)asciiCode;

    System.out.println("The character for ASCII code " + asciiCode + " is " + letter);
  }
}