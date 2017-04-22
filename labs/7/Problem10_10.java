/**
 * file: Problem 10_10
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, April 25th 2017
 * version: 0.1
 *
 * Program will calculate the Body Mass Index of an individual and evaluate
 * which category that individual fits in.
 */

public class Problem10_10{
  public static void main(String[] args){
  	// Initialize Queue object
    QueueOfIntegers queue = new QueueOfIntegers();

    // Add new element to queue
    for(int i = 1; i <= 20; i++){
      queue.enqueue(i);
    } 

    // Remove first element from queue
    while (!queue.empty()){
      System.out.print(queue.dequeue() + " ");
    }
  }
}