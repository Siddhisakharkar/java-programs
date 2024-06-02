/*Write a Java program to test if 10 appears as the first or last element of an array of 
integers. The array length must be broader than or equal to 2.*/
import java.util.*;

class S19
{
  public static void main(String args[])
  {
    int[] arr = {10,20,30,40,50,60,10,90};
    
    if(arr[0] == arr[7])
    {
      System.out.println(arr[0]);
    }
    else
    {
      System.out.println("The elements not found");
    }
  }
}