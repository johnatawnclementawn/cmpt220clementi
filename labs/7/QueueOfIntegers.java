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

public class QueueOfIntegers{
  // Initialize default capacity of queue array
  public static final int DEFAULT_CAPACITY = 8;
  // Initialize size as default capacity 
  private int size = DEFAULT_CAPACITY;
  // Initialize queue of elements with size of capacity
  private int[] elements = new int[size];
  // idx used to find location of last variable in queue
  private int idx = 0;

  // Default constructor - default capacity = 8
  public QueueOfIntegers(){
    this (DEFAULT_CAPACITY);
  }

  // Constructor for differnt capacity
  public QueueOfIntegers(int capacity){
    elements = new int[capacity];
  }

  public void enqueue(int v){
    // Check if queue is out of bounds (no more spaces in array)
    // If no more spaces, double size
    if(idx + 1 == size){
      size *= 2;
    }
    
    // Create new queue with capacity of doubled size
    int[] newElements = new int[size];

    // Deep copy full queue to new queue 
    for(int i = 0; i < idx; i++){
      newElements[i] = elements[i];
    }
      
    // Once newElements is filled with old queue values, add inputed value to end of queue
    newElements[idx] = v;
    // Increment index to next space in queue
    idx++;

    // Remove values from elements, then shallow copy elements to newElements
    elements = null;
    elements = newElements;
    
  }


  public int dequeue(){
    // Retrieves first element which is being removed
    int output = elements[0];

    // Create new queue with one less space for queue
    int[] newElements = new int[size];

    if(idx + 1 < size / 2){
      size /=2;
    }
    
    // Deep copy elements[i + 1] to newElements[i]
    for(int i = 1; i < idx; i++){
      newElements[i -1] = elements[i];
    }

    idx--;

    // Remove values from elements, then shallow copy elements to newElements
    elements = null;
    elements = newElements;

    // Returns removed element
    return output;
  }
  
  // Test if stack is empty
  public boolean empty(){
    return size == 0;
  }

  // Return number of elements in stack
  public int getSize(){
    return idx;
  }
}