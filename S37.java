/*Write a Java program that reads an integer between 0 and 1000 and adds 
all the digits in the integer.*/

import java.util.*;
class S37
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Input the integer between 0 and 1000 :");
    int num = in.nextInt();
    
    int a = num % 10;
    int remainingNumber = num / 10;
    
    int b = num % 10;
    remainingNumber = remainingNumber / 10;
    
    int c = num % 10;
    remainingNumber = remainingNumber / 10;
    
    int d = num % 10;
    remainingNumber = remainingNumber / 10;
    
    int sum = c + b + a + d;
    System.out.println("The sum of all digits in " + num + " is " + sum);
    
    
  }
}