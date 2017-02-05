/**
 * file: Problem 3.4
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, February 1st, 2017
 * version: 0.1
 *
 * This file contains the methodology for a program that randomly 
 * generates a number between 1 and 12, which displays the month
 * of the year which that number corresponds to.
 */

import java.util.Scanner;

public class Problem3_4 {
  public static void main(String[] args){

    Scanner input = new Scanner (System.in);
    
    //Random number is generated to correspond to month of the year. 
    int month = 1 + (int)(Math.random() * 12);
    String monthStr = "";
    
    if (month == 1) {
      monthStr = "January";
    }  else if (month == 2) {
      monthStr = "February";
    } else if (month == 3) {
      monthStr = "March";
    } else if (month == 4) {
      monthStr = "April";
    } else if (month == 5) {
      monthStr = "May";
    } else if (month == 6) {
      monthStr = "June";
    } else if (month == 7) {
      monthStr = "July";
    } else if (month == 8) {
      monthStr = "August";
    } else if (month == 9) {
      monthStr = "September";
    } else if (month == 10) {
      monthStr = "October";
    } else if (month == 11) {
      monthStr = "November";
    } else if (month == 12) {
      monthStr = "December";
    } else {
      monthStr = "Invalid Month";
    } 
     

    System.out.println("The random month is: " + monthStr);
  }
}