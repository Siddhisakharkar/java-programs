/*Write a Java program to get a number from the user and print whether it is positive or negative.*/
import java.util.*;
import java.util.Scanner;

class S44
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Input the integer :");
    int a = in.nextInt();
    
    if(a > 0)
    {
      System.out.println("Number is positive");
    }
    else 
    {
      System.out.println("Number is negative");
    }
  }
}