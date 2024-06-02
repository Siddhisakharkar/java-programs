import java.util.*;

class S14
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Input the first number :");
    int a = in.nextInt();
    
    System.out.println("Input the Second number :");
    int b = in.nextInt();
    
    int divided = a / b;
    
    int result = a - (divided * b);
    
    System.out.println(result);
    
  }
 
}