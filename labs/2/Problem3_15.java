/**
 * file: Problem3_15.java
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, February 7th, 2017
 * version: 0.1
 *
 * This file contains the methodology for a program that 
 *
 */

import java.util.Scanner;

public class Problem3_15 {
  public static void main(String[] args){

   // Generate a lottery number
    int lottery = ((int)(Math.random() * 1000)) - 1; 

    Scanner input = new Scanner(System.in);

    // Prompt the user to enter a guess
    System.out.print("Enter your lottery pick (three digits): "); 
    int guess = input.nextInt();

    // Get digits from lottery
    int lotteryDigit1 = lottery / 10; 
    int lotteryDigit2 = lottery % 10; 
    int lotteryDigit3 = lottery /100;
    int lotteryTot = lotteryDigit1 + lotteryDigit2 + lotteryDigit3;

    // Get digits from guess
    int guessDigit1 = guess / 10;
    int guessDigit2 = guess % 10;
    int guessDigit3 = guess / 100;
    int guessTot = guessDigit1 + guessDigit2 + guessDigit3;

    System.out.println("The lottery number is " + lottery); 

    int lotterySwitch = 0;

    // Check the guess
    if (guess == lottery) {
      lotterySwitch = 1;  
    } else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2 
        && guessDigit3 == lotteryDigit3) {
        lotterySwitch = 2; 
    } else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2
        || guessDigit1 == lotteryDigit3 || guessDigit2 == lotteryDigit2 
        || guessDigit2 == lotteryDigit3 || guessDigit3 == lotteryDigit3 &&  
          guessTot == lotteryTot) {
          lotterySwitch = 3;  
    } else {
        lotterySwitch = 0;  
      } 


    switch(lotterySwitch) {
      case 1: System.out.println("Exact match: you win $10,000");
        break;
      case 2: System.out.println("Match all digits: you win $3,000");
        break;
      case 3: System.out.println("Match one digit: you win $1,000");        
        break;
      default: System.out.println("Sorry, no match"); 
    } 
  }
}
