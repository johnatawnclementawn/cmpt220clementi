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

/**
   * BMI
   *
   *  Class stores values necessary for calulation of BMI. 
   *  It also handles the calculation of BMI.  
   *
   * Return value: 
   */
public class BMI{
  private String name;
  private int age;
  private double weight; // In pounds
  private double height; // In inches
  private double feet;
  private double inches;
  public static final double KILOGRAMS_PER_POUND = 0.45359237;
  public static final double METERS_PER_INCH = 0.0254;

  // Default constructor, initializes default BMI object
  public BMI(){
    this("",0,0,0);
  }

  // Constructor for name, age, weight, feet, inches (as replacement for height)
  public BMI(String name, int age, double weight, double feet, double inches){
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.feet = feet;
    this.inches = inches;
    this.height = ((12 * feet) + inches);
  }

  // Constructor for name, age, weight, height
  public BMI(String name, int age, double weight, double height){
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.height = height;
  }

  // Constructor for name, weight, height
  public BMI(String name, double weight, double height){
    this.name = name;
    this.weight = weight;
    this.height = height;
  }

  /**
   * getBMI
   *
   * Calculate BMI using stored values
   *
   * Parameters:
   *   none:
   *
   * Return value: 
   *   Calculated BMI
   */
  public double getBMI(){
    double bmi = (weight * KILOGRAMS_PER_POUND / 
        ((height * METERS_PER_INCH) * (height * METERS_PER_INCH)));
    return Math.round(bmi * 100) / 100.0;
  }

  /**
   * getStatus
   *
   * Based on calculated BMI value, determine which category of BMI the person is in
   *
   * Parameters:
   *   none:
   *
   * Return value: 
   *   String representation of the category of BMI
   */
  public String getStatus(){
    double bmi = getBMI();
    if (bmi < 18.5){
      return "Underweight";
    }  else if (bmi < 25){
         return "Normal";
    }  else if (bmi < 30){
         return "Overweight";
    }  else {
         return "Obese";
    }
  }

  /**
   * setName
   *
   * Setter for user inputed value for name
   *
   * Parameters:
   *   value - user inputed name value ("value" takes any value that is a string)
   *
   * Return value: 
   *   none
   */
  public void setName(String value){
    this.name = name;
  }

  /**
   * setAge
   *
   * Setter for user inputed value for age
   *
   * Parameters:
   *   value - user inputed age value ("value" takes any value that is a int)
   *
   * Return value: 
   *   none
   */
  public void setAge(int value){
    this.age = age;
  }

  /**
   * setWeight
   *
   * Setter for user inputed value for weight
   *
   * Parameters:
   *   value - user inputed weight value ("value" takes any value that is a double)
   *
   * Return value: 
   *   none
   */
  public void setWeight(double value){
    this.weight = weight;
  }

  /**
   * setHeight
   *
   * Setter for user inputed value for height
   *
   * Parameters:
   *   value - user inputed height value ("value" takes any value that is a double)
   *
   * Return value: 
   *   none
   */
  public void setHeight(double value){
    this.height = height;
  }

  /**
   * setFeet
   *
   * Setter for user inputed value for feet
   *
   * Parameters:
   *   value - user inputed feet value ("value" takes any value that is a double)
   *
   * Return value: 
   *   none
   */
  public void setFeet(double value){
    this.feet = feet;
  }

  /**
   * setInches
   *
   * Setter for user inputed value for inches
   *
   * Parameters:
   *   value - user inputed inches value ("value" takes any value that is a double)
   *
   * Return value: 
   *   none
   */
  public void setInches(double value){
    this.inches = inches;
  }


  /**
   * getName
   *
   * Retrieves user inputed value of name
   *
   * Parameters:
   *   name
   *
   * Return value: 
   *   current name 
   */
  public String getName(){
    return name;
  }

  /**
   * getAge
   *
   * Retrieves user inputed value of age
   *
   * Parameters:
   *   name
   *
   * Return value: 
   *   current age
   */
  public int getAge(){
    return age;
  }

  /**
   * getWeight
   *
   * Retrieves user inputed value of weight
   *
   * Parameters:
   *   name
   *
   * Return value: 
   *   current weight
   */
  public double getWeight(){
    return weight;
  }

  /**
   * getHeight
   *
   * Retrieves user inputed value of height
   *
   * Parameters:
   *   name
   *
   * Return value: 
   *   current height
   */
  public double getHeight(){
    return height;
  }

  /**
   * getFeet
   *
   * Retrieves user inputed value of feet
   *
   * Parameters:
   *   name
   *
   * Return value: 
   *   current feet
   */
  public double getFeet(){
    return feet;
  }

  /**
   * getInches
   *
   * Retrieves user inputed value of inches
   *
   * Parameters:
   *   name
   *
   * Return value: 
   *   current inches
   */
  public double getInches(){
    return inches;
  }
}