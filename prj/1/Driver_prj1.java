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

    // Input values of first function
    while (i < vFirstLen){
      vFirst[i] = input.nextDouble();
      i++;
    }
    
    // Reset I to 0 and input values of second function
    i = 0;
    while (i < vSecondLen){
      vSecond[i] = input.nextDouble();
      i++;
    }

    double[] cResult = convolveVectors(vFirst,vSecond);

    // Round each output to the nearest integer and display 
    for (i = 0; i < (vFirst.length + vSecond.length - 1); i++){
      System.out.print(Math.round(cResult[i]) + ", ");
    }
    System.out.print("\n");
  }

  /**
   * convolveVectors
   *
   * This function switches the order of the numbers of an array
   *
   * Parameters:
   *   vFirst - the first of the vectors to be convolved
   *   vSecond - the second of the vectors to be convolved 
   *
   * Return value: vResult
   */
  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {
    // Set the length of the convoled vector 
    double[] vResult = new double[(vFirst.length + vSecond.length) - 1];
      
      for (int idx = 0; idx < (vFirst.length + vSecond.length - 1); idx++) {
        vResult[idx] = 0;

        for (int shift = 0; shift < vSecond.length; shift++) {
          
          if ((idx - shift >= 0) && (idx - shift < vFirst.length)) {
            vResult[idx] += (vFirst[idx - shift] * vSecond[shift]);
          }
        }
      }
    return vResult;  
  }
}