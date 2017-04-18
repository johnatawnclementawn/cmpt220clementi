/**
 * file: Rectangle
 * author: Johnathan Clementi
 * course: CMPT 220 Software Development 1, Section 201
 * due date: Tuesday, April 16 2017
 * version: 0.1
 *
 * 
 */

public class Rectangle {

  // Default width and height = 1x1  
  private double width = 1;
  private double height = 1;

  // No arg (default) constructor
  Rectangle(){
  }

  // Constructor sets width and height to user inputs
  Rectangle(double w, double h){
    this.width = w;
    this.height = h;
  }

 /**
   * setWidth
   *
   * Need a 'setter' for width because it is private
   *
   * Parameters:
   *   w - user inputed width value
   *
   * Return value: none
   */
  public void setWidth(double w){
    this.width = w;
  }

  /**
   * setHeight
   *
   * Need a 'setter' for height because it is private
   *
   * Parameters:
   *   h - user inputed height value
   *
   * Return value: none
   */
  public void setHeight(double h){
    this.height = h;
  }

  /**
   * getWidth
   *
   * Need a 'getter' for width because it is private
   *
   * Parameters:
   *   none
   *
   * Return value: user inputed value of width
   */
  public double getWidth(){
    return this.width;
  }

    /**
   * getHeight
   *
   * Need a 'getter' for height because it is private
   *
   * Parameters:
   *   none
   *
   * Return value: user inputed value of height
   */
  public double getHeight(){
    return this.height;
  }

 /**
   * getArea
   *
   * Calculates the area of a rectangle
   *
   * Parameters:
   *   none
   *
   * Return value: area of a rectangle (width * height)
   */
  public double getArea(){ 
  return (width * height);
  }


 /**
   * getPerimeter 
   *
   * Calculates the perimeter of a rectangle
   *
   * Parameters:
   *   none
   *
   * Return value: perimeter of a rectangle ((width*2) * (height*2))
   */
  public double getPerimeter(){ 
  return ((width * 2) * (height * 2));
  }
}