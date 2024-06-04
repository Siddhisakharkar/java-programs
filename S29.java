/*Write a Java program to get the current system environment and system properties.*/
import java.lang.*;

class S29
{
  public static void main(String args[])
  {
    System.out.println("\nCurrent System Environment :");
    System.out.println(System.getenv());
    
    System.out.println("\n\nCurrent system properties:");
    System.out.println(System.getProperties());
  }
}