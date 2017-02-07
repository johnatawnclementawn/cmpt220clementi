/**
 * file: Problem 4.15
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, February 7th, 2017
 * version: 0.1
 *
 * This file contains the methodology for a program that recieves an 
 * input from the user in the form of a letter and displays its numerical
 * value based on the international standard letter/number map.
 */

import java.util.Scanner;

public class Problem4_15 {
  public static void main(String[] args){

    Scanner input = new Scanner (System.in);

    char letter;

    // User input letter value, prevents non alphabetical
    System.out.println("Enter a letter: ");
    letter = input.next().charAt(0);

    // Convert letter to uppercase
    letter = Character.toUpperCase(letter);

    // Evaluates letter input and outputs numerical value for that letter
    if (letter == 'A' || letter == 'B' || letter == 'C') {
    	System.out.println("The corresponding number is 2.");
    } else if (letter == 'D' || letter == 'E' || letter == 'F') {
        System.out.println("The corresponding number is 3.");
    } else if (letter == 'G' || letter == 'H' || letter == 'I') {
        System.out.println("The corresponding number is 4.");
    } else if (letter == 'J' || letter == 'K' || letter == 'L') {
        System.out.println("The corresponding number is 5.");
    } else if (letter == 'M' || letter == 'N' || letter == 'O') {
        System.out.println("The corresponding number is 6.");
    } else if (letter == 'P' || letter == 'Q' || letter == 'R' || letter == 'S') {
        System.out.println("The corresponding number is 7.");
    } else if (letter == 'T' || letter == 'U' || letter == 'V') {
        System.out.println("The corresponding number is 8.");
    } else if (letter == 'W' || letter == 'X' || letter == 'Y' || letter == 'Z') {
        System.out.println("The corresponding number is 7.");
    } else { 
        System.out.println("That is an invalid input");
    }
  }
}