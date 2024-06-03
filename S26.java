/*Write a Java program to multiply the corresponding elements of two integer arrays.*/

import java.util.Arrays;

class S26
{
  public static void main(String args[])
  { 
    String result = " ";
    int[] a = {1,2,3,4};
    int[] b = {5,6,7,8};
    
    System.out.println("The orginial array a is : " + Arrays.toString(a));
    System.out.println("The orginial array b is : " + Arrays.toString(b));
    
    for(int i = 0 ; i < a.length ; i++)
    {
      int x1 = a[i];
      int x2 = b[i];
      result += Integer.toString(x1 * x2) + " ";
    }
    
    System.out.println("\nResult : " + result);
  }


}