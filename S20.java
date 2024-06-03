/*Write a Java program to test that a given array of 
integers of length 2 contains a 4 or a 7.*/

import java.util.*;

class S20
{
  public static void main(String args[])
  {
    int[] arr = {5,7};
    if(arr[0] == 4 || arr[1] == 7)
    {
      System.out.println("True");
    }
    else
    {
      System.out.println("The nummber not found");
    }
}
}