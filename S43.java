/*Write a Java program that accepts two integers from the user and prints the sum, the 
difference, the product, the average, the distance (the difference between the integers), 
the maximum (the largest of the two integers), and the minimum (the smallest of the two integers).*/


import java.util.Scanner;

class S43
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Input the first integer :");
    int a = in.nextInt();
    
    System.out.println("Input the Second integer :");
    int b = in.nextInt();
    
    System.out.println("==================================================");
    System.out.println("The addition of two integers is :"+ (a + b));
    System.out.println("The substraction of two integers is :"+ (a - b));
    System.out.println("The product of two integers is :"+ (a * b));
    System.out.println("The average of two integers is :"+ (a + b) / 2);
    System.out.println("The distance of two integers is :"+ (a - b));
    System.out.println("The Maximum of two integers is :"+ Math.max(a,  b));
    System.out.println("The Minimum of two integers is :"+ Math.min(a,  b));
  }
}