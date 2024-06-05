/*Write a Java program that prints the current time in GMT.*/

import java.util.*;
class S39
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Input the current time in GMT is");
    
    long timeZoneChange = in.nextInt();
    
    long totalMilliseconds = System.currentTimeMillis();
    
    long totalSeconds = totalMilliseconds / 1000;
    
    long currentSeconds = totalSeconds % 60;
    
    long totalMinutes = totalSeconds / 60;
    
    long currentMinutes = totalMinutes % 60;
    
    long totalHours = totalMinutes / 60;
    
    long currentHours = ((totalHours + timeZoneChange) % 24);
    
    System.out.println("Current time is" + currentHours + ":" + currentMinutes + ":" + currentSeconds);
    
    
    
    
    
  }
}