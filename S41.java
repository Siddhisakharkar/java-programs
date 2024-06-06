import java.util.*;
import java.util.Scanner;

class S41
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    float timeSeconds ;
    float mps, kph , mph;
    
    System.out.println("Input the distance in meters :");
    float distance = in.nextFloat();
    
    System.out.println("Input the hours:");
    float hr = in.nextFloat();
    
    System.out.println("Input min :");
    float min = in.nextFloat();
    
    System.out.println("Input Seconds :");
    float sec = in.nextFloat();
    
    timeSeconds = (hr * 3600) + (min * 60) + sec;
    mps = distance / timeSeconds;
    kph = (distance/1000.0f)/(timeSeconds/3600.0f);
    mph = kph / 1.609f;
    System.out.println("==============================");
    System.out.println("The distance in m/s is :" + mps);
    System.out.println("The distance in k/h is :" + kph);
    System.out.println("The distance in m/h is :" + mph);
    
    
  }
}