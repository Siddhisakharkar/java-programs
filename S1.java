import java.util.Arrays;
class S1 
{
  public static void main(String args[])
  {
    int[] arr1 = {1,2,3,6,4,10,66,54};
    
    String[] arr2 = {"Siddhi","Apple","Html","Php","Java"};
    
    System.out.println("The original array is :"+ Arrays.toString(arr1));
    Arrays.sort(arr1);
    System.out.println("The sorted array is :" + Arrays.toString(arr1));
    
    System.out.println("The original array is :" + Arrays.toString(arr2));
    Arrays.sort(arr2);
    System.out.println("The sorted array is :" + Arrays.toString(arr2));
    
  }
}