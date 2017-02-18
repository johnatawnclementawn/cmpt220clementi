/**
 * file: Problem 5.1
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, February 21, 2017
 * version: 0.1
 *
 * This file contains the methodology for a program that calculates
 * the anual increase of tuition by 5% and calculates the total of 4 years
 * tuition after 10 years has passed.
 */

public class Problem5_7 {
  public static void main(String[] args){

    double tuition = 10000.0;
    double totCost = 0.0;

    // For loop repeates calculations until the year has reached 14
    for (int year = 0; year < 14; year++) {
      // Increases tutition for each year
      tuition = (tuition * 1.05);

      // Calculates just the increase in tuition for the first 9 years, then
      // adds 4 years of tuition
      if (year == 9){
        System.out.format("The tuition for the 10th year is: %.2f\n", tuition);
      } else if (year > 9) {
          totCost = (totCost + tuition);
      }
    }
    System.out.format("The total cost of tuition is:  %.2f\n", tuition);
  }  
}