/**
 * file: Problem 9.13
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, April 18th 2017
 * version: 0.1
 *
 * This file contains the methodology that finds the location of the largest value 
 * in a matrix
 */

/**
   * Location
   *
   *   Handles storage of matrix and locating of largest number in said matrix.
   *    
   */
public class Location{

  public int row = 0;
  public int column = 0;
  public double maxValue = 0.0;
  
  // Default constructor, prepares three object with three fields
  Location(){
    this(0,0,0.0);
  }

  // 
  Location(int r, int c, Double val){
    // Sets row value of max value
    setRow(r);
    // Sets column value of max value
    setColumn(c);
    // Stores the max value itself for later evalution
    setMaxValue(val);
  }

  /**
   * setRow
   *
   * Once the algorithm evaluates if the maxValue is larger or smaller than the
   * current value, the row of the new maxValue is stored.
   *
   * Parameters:
   *   r - row value of the maxValue attribute
   *
   * Return value: none
   */
  public void setRow(int r){
    this.row = r;
  }

  /**
   * setColumn
   *
   * Once the algorithm evaluates if the maxValue is larger or smaller than the
   * current value, the column of the new maxValue is stored.
   *
   * Parameters:
   *   c - column value of the maxValue attribute
   *
   * Return value: none
   */
  public void setColumn(int c){
    this.column = c;
  }

  /**
   * setMaxValue
   *
   * Once the algorithm evaluates if the maxValue is larger or smaller than the
   * current value, the maxValue is stored for futher evaluation.
   *
   * Parameters:
   *   val - value of the previous maxValue
   *
   * Return value: none
   */
  public void setMaxValue(Double val){
    this.maxValue = val;
  }
  
  /**
   * getRow
   *
   * Retrieves value of the row in which the maxValue is found
   *
   * Parameters:
   *   none
   *
   * Return value: row value of location object
   */
  public int getRow(){
    return this.row;
  }

  /**
   * getColumn
   *
   * Retrieves value of the column in which the maxValue is found
   *
   * Parameters:
   *   none
   *
   * Return value: column value of location object
   */
  public int getColumn(){
    return this.column;
  }

  /**
   * getMaxValue
   *
   * Retrieves the maxValue within the matrix
   *
   * Parameters:
   *   none
   *
   * Return value: maxValue of location object
   */
  public double getMaxValue(){
    return this.maxValue;
  }

 /**
   * locateLargest
   *
   * Evaluates the location of 
   *
   * Parameters:
   *   matrix - two dimensional array
   *
   * Return value: location object (this)
   */
  public Location locateLargest(double[][] a){

    // Initialize maxValue to first location in the matrix
    setMaxValue(a[0][0]);

    // For statements move through the array in this order:
    // Row 1 (column 1,2,3,4,etc)
    // Row 2 (column 1,2,3,4,etc) 
    // Row etc (column etc)
    for(int i = 0; i < a.length; i++){
      for(int j = 0; j < a[0].length; j++){

        // If the current min is less than the locatio being evaluated, 
        // set the current location to the min value
        if (getMaxValue() < a[i][j]){
          setRow(i);
          setColumn(j);
          setMaxValue(a[i][j]);
        }
      }
    }
  return this;
  }
}