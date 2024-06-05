/*Write a Java program to convert minutes into years and days.*/

import java.util.*;

class S38
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the minutes :");
    double min = in.nextDouble();
    
    double minutesInYear = 60 * 24 * 365;
    
     long years = (long) (min / minutesInYear);
     int days = (int) (min / 60 / 24) % 365;
    
     System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
    
  }
}