import java.util.*;

class S7 
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Input Numbers :");
    int seconds = in.nextInt();
    
    int S = seconds % 60;
    int H = seconds / 60;
    int M = H % 60;
    H = H / 60;
    
    System.out.println(H + ": " + M + " :" + S);
    System.out.println("\n");
  }
}