import java.util.*;

class S33
{
  public static void main(String args[])
  {
    Scanner scanner  = new Scanner(System.in);
    
    System.out.println("The first Input :");
    int a = scanner.nextInt();
    
    System.out.println("The second Input :");
    int b = scanner.nextInt();
    
    System.out.println("The third Input :");
    int c = scanner.nextInt();
    
    System.out.println("The fourth Input :");
    int d = scanner.nextInt();
    
    if(a == b && b== c  && c== d)
    {
      System.out.println("Equal all input numbers");
    }
    else
    {
      System.out.println("Digits are not Equal ");
    }
  }
}

