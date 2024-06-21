/*Write a program in Java to input 5 numbers from the keyboard and find their sum and average.*/

import java.util.Scanner;
class S58
{
  public static void main(String args[])
  {
  int m=0 , s=0 , i;
  double avg;
  {
  System.out.println("Input the numbers :");
  }
  for(i=0 ; i<5 ; i++)
  {
    Scanner in = new Scanner(System.in);
    m = in.nextInt();
    
    s += m;
    
  }
  avg = s / 5;
  System.out.println("The sum of 5 no is : " +s+"\nThe Average is : " +avg);
}
}