/*Write a Java program to get the value of environment variables PATH, TEMP, USERNAME.*/

import java.lang.*;

class S31
{
  public static void main(String args[])
  {
    System.out.println("\nEnvironment variable path :");
    System.out.println(System.getenv("PATH"));
    
    System.out.println("\nEnvironment variable temp :");
    System.out.println(System.getenv("TEMP"));
    
    System.out.println("\nEnvironment variable username :");
    System.out.println(System.getenv("USERNAME"));
  }
}