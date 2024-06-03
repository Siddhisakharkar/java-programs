/*Write a Java program to get the largest value between the first and last elements
of an array (length 3) of integers.*/

import java.util.Arrays;

class S23
{
  public static void main(String args[])
  {
    int[] arr = {20 , 30, 40};
    
    System.out.println("arr :" + Arrays.toString(arr));
    
    if(arr[2] >= arr[0])
    {
      System.out.println("The gretest value is :" + arr[2]);
    }
  }
}