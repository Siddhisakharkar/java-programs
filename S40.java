/*Write a Java program to compute the body mass index (BMI). */

import java.util.*;

class S40
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Input the weights in pounds :");
    double weight = in.nextDouble();
    
    System.out.println("Input the wheights in inches :");
    double height = in.nextDouble();
    
    double BMI = weight * 0.45359237 / (height * 0.0254 * height * 0.0254);
    
    System.out.println("BMI is " + BMI + "\n");
    
    
  }
}