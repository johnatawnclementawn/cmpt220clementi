/**
 * file: Problem 6.8
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, February 21, 2017
 * version: 0.1
 *
 * This file contains the methodology for a program 
 */

public class Problem6_8 {
  public static void main(String[] args){
    double celsius = 0.0;
    double fahrenheit = 0.0;
    
    for (int i = 40; i > 29; i--){
      System.out.println("Celsius" + "\t\t" + "Fahrenheit");
      System.out.println(celsius + "\t\t" + celsiusToFahrenheit(celsius));
      break;
    }

    for (int i = 40; i > 29; i--){
      System.out.println("Fahrenheit" + "\t\t" + "Celsius");
      System.out.println(fahrenheit + "\t\t" + fahrenheitToCelsius(fahrenheit));
      break;
    }
  }

  /**for (i = 40, i >= 30, i--){
      System.out.println("Celsius" + \t\t + "Fahrenheit");
      System.out.println(celsius + \t\t) + convCelsius;
   * celsiusToFahrenheit
   *
   * This function will test the reversed number to see if the number is
   * indeed a palindrome
   * Parameters: celsius 
   *
   * Return value: convCelsius
   */
  public static double celsiusToFahrenheit(double celsius){
  	// Conversion formula for celsius to fahrenheit
  	double convCelsius = (9.0 / 5) * (celsius + 32);
  	return convCelsius;
  }

   /**
   * fahrenheitToCelsius
   *
   * This function will test the reversed number to see if the number is
   * indeed a palindrome
   * Parameters: fahrenheit 
   *
   * Return value: convFahrenheit
   */
  public static double fahrenheitToCelsius(double fahrenheit){
    // Conversion formula for fahrenheit to celsius
    double convFahrenheit = (5.0 / 9) * (fahrenheit - 32);
    return convFahrenheit;
  }
}