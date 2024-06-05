/*Write a Java program that reads a number in inches and converts it to meters.*/

import java.util.*;

class S36
{
  public static  void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Input number in inches is");
    double d = in.nextDouble();
    
    double meter = 0.0254 * d;
    System.out.println("Conversion from inches to meter is :"+ meter);
  }
}