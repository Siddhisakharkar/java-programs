import java.util.*;

class S13
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Input the First Number :");
    int a = in.nextInt();
    
    System.out.println("Input the Second Number :");
    int b = in.nextInt();
    
    System.out.println("Result : " + common_digit(a,b));
    
  }
  public static boolean common_digit(int p , int q)
  {
  if(p < 25 || q > 75)
  {
    System.out.println("False");
  }
  int x = p % 10;
  int y = q % 10;
  
  p /= 10;
  q /=10;
  
  return(p==q || p==y || x==y || x==q);
}
}