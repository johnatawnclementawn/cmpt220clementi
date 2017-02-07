/**
 * file: Problem 3.4
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, February 7th, 2017
 * version: 0.1
 *
 * This file contains the methodology for a program that outputs
 * the number of days in the month chosen by the user.
 */


import java.util.Scanner;

public class Problem3_11 {
  public static void main(String[] args){

    Scanner input = new Scanner (System.in);
    
    int month = 0;
    int year = 0;
    int numberDays = 0;
    String monthstr = "";

    // User interface
    System.out.println("Type the month here (numerical value only):");
      month = input.nextInt();
    System.out.println("Type the year here: ");
      year = input.nextInt();

    switch (month) {
      // January, March, May, July, August, October, and December  
      // all have 31 days, and are thus grouped together.
      case 1: monthstr = "January";
      case 3: monthstr = "March";
      case 5: monthstr = "May";
      case 7: monthstr = "July";
      case 8: monthstr = "August";
      case 10: monthstr = "October";
      case 12: monthstr = "December";
        numberDays = 31;
        break;

      // Additionally, April, June, September,
      // and November all have 30 days, and are grouped together. 
      case 4: monthstr = "April";
      case 6: monthstr = "June";
      case 9: monthstr = "September";
      case 11: monthstr = "November";
        numberDays = 30;
        break;

      // This case accounts for leap day counting. A leap year is considered
      // a year that is divisible by 4, but not by 100; or is divisible by 400. 
      case 2: 
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
          numberDays = 29;
        } else {
            numberDays = 28;
        }
        monthstr = "February";
        break;
      default: System.out.println("That is an incorrect input");
    } 
    System.out.println("The number of days in " + monthstr + " was " + numberDays + 
      " in the year " + year);
  }
}