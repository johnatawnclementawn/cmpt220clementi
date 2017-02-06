/**
 * file: Problem 3.4
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, February 1st, 2017
 * version: 0.1
 *
 * This file contains the methodology for a program that outputs
 * the number of days in the month chosen by the user.
 */


import java.util.Scanner;

public class Problem3_4 {
  public static void main(String[] args){

    Scanner input = new Scanner (System.in);
    
    int month = 0;
    int year = 0;
    String monthStr = "";

    boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    
    System.out.println("Input the numerical value of a month to see how many days
      are in that month.");
    year = input.newInt();

    System.out.println("Type the year to see how many days
      are in that month.");
    year = input.newInt();


    Switch(month) {
      case 1: monthStr =  "January has 31 days in ";
        break;
      case 2: if (isLeapYear == false) {
                System.out.println("Febuary has 28 days because " + year + " is not a leap year.");
              }
              else if (isLeapYear == true) {
                System.out.println("Febuary has 29 days because " + year + "is a leap year.");
              }
        break;
      case 3: monthStr = "March has 31 days in ";
        break;
      case 4: monthStr = "April has 30 days in ";
        break;
      case 5: monthStr = "May has 31 days in ";
        break;
      case 6: monthStr = "June has 30 days in ";
        break;
      case 7: monthStr = "July has 31 days in ";
        break;
      case 8: monthStr = "August has 31 days in ";
        break;
      case 9: monthStr = "September has 30 days in ";
        break;
      case 10: monthStr = "October has 31 days in ";
        break;
      case 11: monthStr = "November has 30 days in ";
        break;
      case 12: monthStr = "December has 31 days in ";
        break;
      default: monthStr = "That is an incorrect input"; 
    } 
  }
}