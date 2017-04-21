/**
 * file: Problem 10_2
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, April 25th 2017
 * version: 0.1
 *
 * Program will calculate the Body Mass Index of an individual and evaluate
 * which category that individual fits in.
 */

public class Problem10_2{
  public static void main(String[] args){

    // Output BMI data
    BMI bmi1 = new BMI("Kim Yang", 18, 145, 70);
    System.out.println("The BMI for " + bmi1.getName() + " is "
        +bmi1.getBMI() + " " + bmi1.getStatus());

    BMI bmi2 = new BMI("Susan King", 215.0, 70.0);
    System.out.println("The BMI for " + bmi2.getName() + " is "
        +bmi2.getBMI() + " " + bmi2.getStatus());

    BMI bmi3 = new BMI("Johnathan", 21, 145, 70);
    System.out.println("The BMI for " + bmi3.getName() + " is "
        +bmi3.getBMI() + " " + bmi3.getStatus());    
  }
}