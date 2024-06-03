/*Write a Java program to rotate an array (length 3) of integers in the left direction.*/

import java.util.Arrays;

class S22
{
  public   static void main(String args[])
  {
    int[] arr = {20,30,40};
    
    System.out.println("arr :" + Arrays.toString(arr));
    
    int[] new_arr = {arr[1] , arr[2] , arr[0]};
    
    System.out.println("new_arr :" + Arrays.toString(new_arr));
  }
}