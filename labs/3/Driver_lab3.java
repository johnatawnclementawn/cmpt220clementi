/**
 * file: Driver_lab3
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, February 21, 2017
 * version: 0.1
 *
 * This file contains the program that is a solution to the Kattis 
 * Different Distances problem. It recieves 5 integer inputs within the range
 * of 1 to 100, and calculates the p-norm of those points.
 */

import java.util.Scanner;

public class Driver_lab3 {
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    double x1 = 0.0;
    double y1 = 0.0;
    double x2 = 0.0;
    double y2 = 0.0;
    double p = 0.0;
    double answer = 0.0;
    double check = 0.0;

    while ((check = input.nextDouble()) != 0) {

      x1 = check;
      y1 = input.nextDouble();
      x2 = input.nextDouble();
      y2 = input.nextDouble();
      p = input.nextDouble();

      // Calculate p-norm distance between two points 
      // (|x1−x2|^p +|y1−y2|^p)^1/p
      answer = Math.pow((Math.pow(Math.abs(x1 - x2), p)) +
        (Math.pow(Math.abs(y1 - y2), p)), (1 / p));

      System.out.println(answer);
    }
  }
}