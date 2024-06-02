import java.util.*;

class S15
{
  public static void main(String args[])
  {
    String str1 = "Siddhi";
    String str2 = "Sakharkar";
    
    if(str1.length() >= str2.length())
    {
      System.out.println(str2 + str1 + str2);
    }
    else
    {
      System.out.println(str1 + ":" + str2 + ":" + str1);
    }
  }
}