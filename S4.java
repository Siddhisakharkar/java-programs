class S4 
{
  public static void main(String args[])
  {
    int[] arr_1 = {1,2,3,4,5};
    
    int sum = 0;
    
    for(int i= 0 ; i< arr_1.length ; i++)
    {
      sum = sum + arr_1[i];
    }
      double average = sum / arr_1.length;
    
    System.out.println("The average of elements in array :" + average);
  }
}
