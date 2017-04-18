/**
 * file: Problem 9.1
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, April 16 2017
 * version: 0.1
 *
 * Program calculates the area and perimeter of rectangles and exhibits 
 * knowledge of OOP in java.
 */

// import java.util.Scanner;

public class Problem9_1 {
  public static void main(String[] args){
    
    // Set exercise required values for first rectangle
    Rectangle rec1 = new Rectangle(4, 40);

    // Set exercise required values for first rectangle
    Rectangle rec2 = new Rectangle(3.5, 35.9);

    // Display characteristics of rectangle 1
    System.out.println("The dimensions of rectangle 1 are:");
    System.out.println("Width: " + rec1.getWidth());
    System.out.println("Height: " + rec1.getHeight());
    System.out.println("Area: " + rec1.getArea());
    System.out.println("Perimeter: " + rec1.getPerimeter());

    // Display characteristics of rectangle 2
    System.out.println("The dimensions of rectangle 2 are:");
    System.out.println("Width: " + rec2.getWidth());
    System.out.println("Height: " + rec2.getHeight());
    System.out.println("Area: " + rec2.getArea());
    System.out.println("Perimeter: " + rec2.getPerimeter());
  }
}
