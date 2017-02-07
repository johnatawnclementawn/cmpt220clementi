/**
 * file: Question 2
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, February 1st, 2017
 * version: 0.1
 *
 * This file contains the main method for calculating the final
 * grade of an individual in Dr. Pablo Rivas's software development
 * section 201 class.  
 */

import java.util.Scanner;

public class Question2 {
  public static void main(String[] args){

     Scanner input = new Scanner (System.in);

    double hmlabs = 0.0;
    double prjcs = 0.0;
    double midterm = 0.0;
    double finalExam = 0.0;
    int finalGrade = 0;
    String letterGrade;

    System.out.println("Please enter the following as a percentage... ");

    //Midterm grade validator
    do {
      System.out.println("Midterm Exam Grade: ");
      midterm = input.nextDouble();
    }  while (midterm < 0.0 || midterm > 100);  
    
    //Final exam grade validator
    do {
      System.out.println("Final Exam Grade: ");
      finalExam = input.nextDouble();
    }  while (finalExam < 0.0 || finalExam > 100);  

    //Projects grade validator
    do {
      System.out.println("Projects Grade: ");
      prjcs = input.nextDouble();
    }  while (prjcs < 0.0 || prjcs > 100);  

    //Homework and labs grade validator
    do {
      System.out.println("Homework and Labs Grade: ");
      hmlabs = input.nextDouble();
    }  while (hmlabs < 0.0 || prjcs > 100); 
    
    finalGrade = (int)((midterm * 0.20) + (finalExam * 0.20) + (prjcs * 0.20) 
      + (hmlabs * 0.40));

    if (finalGrade >= 95) {
      letterGrade = "A";
    } else if (finalGrade >= 90) {
      letterGrade = "A-";
    } else if (finalGrade >= 87) {
      letterGrade = "B+";
    } else if (finalGrade >= 83) {
      letterGrade = "B";
    } else if (finalGrade >= 80) {
      letterGrade = "B-";
    } else if (finalGrade >= 77) {
      letterGrade = "C+";
    } else if (finalGrade >= 73) {
      letterGrade = "C";
    } else if (finalGrade >= 70) {
      letterGrade = "C-";
    } else if (finalGrade >= 65) {
      letterGrade = "D+";
    } else if (finalGrade >= 60) {
      letterGrade = "D";
    } else {
        letterGrade = "F";
    }


    System.out.println("Your final grade is: " + letterGrade);
  }
}