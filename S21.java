/*Write a Java program to create an array of length 2 from two integer arrays with three elements. The newly created array 
will contain the first and last elements from the two arrays.*/

import java.util.Arrays;

class S21
{
  public static void main(String args[])
  {
    int[] arr1 = {3,6,9};
    int[] arr2 = {4,6,9};
    
    System.out.println("Arr1: " + Arrays.toString(arr1));
    System.out.println("Arr2: " + Arrays.toString(arr2));
    
    int[] new_arr = {arr1[0] , arr2[2]};
    System.out.println("new_arr :" + Arrays.toString(new_arr));
  }
}