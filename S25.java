/*Write a Java program to find the largest element between the first, last, and middle
values in an array of integers (even length).*/

import java.util.Arrays;

class S25
{
  public static void main(String args[])
  {
    int[] arr = {20 , 30 , 40 , 50 , 60};
    
    System.out.println("The original array is : " + Arrays.toString(arr));
    
    if(arr[0] > arr[2] )
    {
      System.out.println("The gretest element is not display");
    }
    else if(arr[2] > arr[4])
    {
      System.out.println("The gretest element is not display");
    }
    else if(arr[4] > arr[2])
    {
      System.out.println(arr[4]);
    }
  }
}