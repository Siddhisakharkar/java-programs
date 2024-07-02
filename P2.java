import java.util.Scanner;
class P2
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Input the age:");
    int a = in.nextInt();
    
    if(a > 18){
      System.out.println("You are an adult");
    }
    else if(a == 18)
    {
      System.out.println("You are na teenager");
    }
    else
    {
      System.out.println("You are not adult");
    }
  }
}