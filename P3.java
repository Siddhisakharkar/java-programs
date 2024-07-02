import java.util.Scanner;
class P3
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Input the marks:");
    int marks = in.nextInt();
    
    if(marks < 25){
      System.out.println("F");
    }
    else if(marks >= 25 && marks<= 44)
    {
      System.out.println("E");
    }
      else if(marks >= 45 && marks<= 49)
    {
      System.out.println("D");
    }
      else if(marks >= 50 && marks<= 59)
    {
      System.out.println("C");
    }
      else if(marks >= 69 && marks<= 79)
    {
      System.out.println("B");
    }
      else
    {
      System.out.println("A");
    }
    
  }
}