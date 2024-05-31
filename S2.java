class S2
{
  public static void main(String args[])
  {
    int[] arr_1 = {1,2,3,4,5,6,7,8,9,10};
    
    int sum = 0;
    
    for(int i : arr_1)
    {
      sum = sum + i;
    }
    System.out.println("The sum of array is " + sum);
  }
}