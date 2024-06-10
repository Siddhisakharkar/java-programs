/*Write a Java program that reads two floating-point numbers and tests whether 
they are the same up to three decimal places.*/
import java.util.Scanner;
class S50
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Input the first float number :");
    double a  = in.nextDouble();
    
    System.out.println("Input the second float number :");
    double b  = in.nextDouble();
    
    a = Math.round(a * 1000);
    a = a / 1000;
    
    b = Math.round(b * 1000);
    b = b / 1000;
    
    if(a == b)
    {
      System.out.println("They are same upto three decimal places");
    }
    else
    {
       System.out.println("They are different");
    }
  }
}