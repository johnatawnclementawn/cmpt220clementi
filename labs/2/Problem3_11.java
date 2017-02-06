/**
 * file: Problem 3.4
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, February 1st, 2017
 * version: 0.1
 *
 * This file contains the methodology for a program that 
 */

import java.util.Scanner;

public class Problem3_4 {
  public static void main(String[] args){

    Scanner input = new Scanner (System.in);
    
    int month = 0;
    int year = 0;
    final int JAN = 1;
    final int FEB = 2;
    final int MAR = 3;
    final int APR = 4;
    final int MAY = 5;
    final int JUN = 6;
    final int JUL = 7;
    final int AUG = 8;
    final int SEP = 9;
    final int OCT = 10;
    final int NOV = 11;
    final int DEC = 12;
    

    Switch(month) {
      case 1: System.out.println("January has 31 days in " + year)
        break;
      case 2: 
        break;
      case 3: System.out.println("March has 31 days in " + year);
        break;
      case 4: System.out.println("April has 30 days in " + year);
        break;
      case 5: System.out.println("May has 31 days in " + year);
        break;
      case 6: System.out.println("June has 30 days in " + year);
        break;
      case 7: System.out.println("July has 31 days in " + year);
        break;
      case 8: System.out.println("August has 31 days in " + year);
        break;
      case 9: System.out.println("September has 30 days in " + year);
        break;
      case 10: System.out.println("October has 31 days in " + year);
        break;
      case 11: System.out.println("November has 30 days in " + year);
        break;
      case 12: System.out.println("December has 31 days in " + year);
        break;
      default: System.out.println("That is an incorrect input"); 
    } 

    System.out.println("The random month is: " + "")
  }
}