/*Write a Java program that reads a number and displays the square, cube, and fourth power.*/

import java.util.*;
import java.util.Scanner;

class S42
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Input the side length of the value :");
    double a = in.nextDouble();
    
    System.out.println("Square of side length is :" + a * a);
    System.out.println("Cube of side length is :" + a * a * a);
    System.out.println("fourth Power of side length is :" + Math.pow(a , 4));
  }
}