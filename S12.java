import java.util.*;
class S12
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Input the First number :");
    int a = in.nextInt();
    
    System.out.println("Input the Second number :");
    int b = in.nextInt();
    
    if(a < b)
    {
      System.out.println("The output is :" + b);
    }
    else if(a == a)
    {
      System.out.println("0");
    }
    else if(a % 6 == b % 6 )
    {
      System.out.println(a);
    }
  }
}