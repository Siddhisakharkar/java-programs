import java.util.Scanner;

class S28
{
  public static void main(String args[])
  {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Input a Number :");
    int n = scanner.nextInt();
    
    while(n!= 1)
    {
      if(n % 2 == 0)
      {
        n = n / 2;
      }
      else
      {
        n = 3 * n + 1;
      }
      System.out.println("Then value of n =" + n);
    }
  }
}