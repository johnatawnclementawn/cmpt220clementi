/**
 * file: Problem 4.10
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, February 7th, 2017
 * version: 0.1
 *
 * This file contains the methodology for a program that asks the user 
 * to indicate what their birthday is by answering yes or no to a series
 * of questions.
 */

import java.util.Scanner;

public class Problem4_10 {
  public static void main(String[] args){

    Scanner input = new Scanner (System.in);

    String set1 =
      " 1 3 5 7\n" + 
      " 9 11 13 15\n" + 
      "17 19 21 23\n" + 
      "25 27 29 31";

    String set2 =
      " 2 3 6 7\n" +
      "10 11 14 15\n" + 
      "18 19 22 23\n" + 
      "26 27 30 31";

    String set3 =
      " 4 5 6 7\n" + 
      "12 13 14 15\n" + 
      "20 21 22 23\n" + 
      "28 29 30 31";

    String set4 =
      "8 9 10 11\n" + 
      "12 13 14 15\n" + 
      "24 25 26 27\n" + 
      "28 29 30 31";

    String set5 =
      "16 17 18 19\n" + 
      "20 21 22 23\n" + 
      "24 25 26 27\n" + 
      "28 29 30 31";

    int day = 0;
  

    // Inquires user for birthday
    System.out.print("Is your birthday in Set1?\n"); 
    System.out.print(set1);
    System.out.print("\nEnter N for No and Y for Yes: "); 
    String answer = input.nextLine();
      if (answer.equalsIgnoreCase("y")){ 
        day += 1;
      }

    // Inquires user for birthday
    System.out.print("\nIs your birthday in Set2?\n"); 
    System.out.print(set2);
    System.out.print("\nEnter N for No and Y for Yes: "); 
    answer = input.nextLine();
      if (answer.equalsIgnoreCase("y")){ 
        day += 2;
      }

    // Inquires user for birthday
    System.out.print("Is your birthday in Set3?\n"); 
    System.out.print(set3);
    System.out.print("\nEnter N for No and Y for Yes: "); 
    answer = input.nextLine();
      if (answer.equalsIgnoreCase("y")){ 
        day += 4;
      }

    // Inquires user for birthday
    System.out.print("\nIs your birthday in Set4?\n"); 
    System.out.print(set4);
    System.out.print("\nEnter N for No and Y for Yes: "); 
    answer = input.nextLine();
      if (answer.equalsIgnoreCase("y")){ 
        day += 8;
      }

    // Inquires user for birthday
    System.out.print("\nIs your birthday in Set5?\n");
    System.out.print(set5);
    System.out.print("\nEnter N for No and Y for Yes: ");
    answer = input.nextLine();
      if (answer.equalsIgnoreCase("y")){ 
        day += 16;
      }

    System.out.println("\nYour birthday is on " + day + "!");
  }
}