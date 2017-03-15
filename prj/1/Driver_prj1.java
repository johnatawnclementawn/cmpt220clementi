/**
 * file: Driver_prj1
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, March 28th, 2017
 * version: 1.0
 *
 * This program uses the theory of convolution to analyze two
 * vectors and create a third vector that has reduced "noise".
 */

import java.util.Scanner;

public class Driver_prj1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // Indicate the length of the arrays
    int vFirstLen = input.nextInt();
    int vSecondLen = input.nextInt();
    int i = 0;
    double[] vFirst = new double[vFirstLen];
    double[] vSecond = new double[vSecondLen];

    while (i < vFirstLen){
      vFirst[i] = input.nextDouble();
      i++;
    }
    
    i = 0;
    while (i < vSecondLen){
      vSecond[i] = input.nextDouble();
      i++;
    }
  }

  /**
   * convolveVectors
   *
   * This function switches the order of the numbers of an array
   *
   * Parameters:
   *   A - array of user inputed numbers to be sorted
   *
   * Return value: temp
   */
  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {
    double[] vResult = new double[(vFirst.length + vSecond.length) - 1];
    
    return vResult;  
  }
}