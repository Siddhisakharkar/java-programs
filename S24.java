/*Write a Java program to swap the first and last elements of an array
(length must be at least 1) and create another array.*/

import java.util.Arrays;

class S24
{ 
  public static void main(String args[])
  {
  int[] arr = {40 , 50 , 60 };
  
  System.out.println("The original Array is : " + Arrays.toString(arr));
  
  int x = arr[0];
  
  arr[0] = arr[arr.length-1];
  arr[arr.length-1] = x;
  
  System.out.println("The array after swaping is : " + Arrays.toString(arr));
  
  }
}