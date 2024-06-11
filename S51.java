/*Write a Java program to find the number of days in a month.*/

import java.util.Scanner;
class S51
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    
    int number_Of_DaysInMonth = 0; 
    String MonthOfName = "Unknown";
    
    System.out.println("Input a month :");
    int month = in.nextInt();
    
    System.out.println("Input a year :");
    int year = in.nextInt();
    
    switch(month)
    {
      case 1 :
        MonthOfName = "January";
        number_Of_DaysInMonth = 31;
        break;
      case 2 :
        MonthOfName = "February";
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
        {
             number_Of_DaysInMonth = 29;
        } 
        else 
        {
            number_Of_DaysInMonth = 28;
        }
      case 3 :
        MonthOfName = "march";
        number_Of_DaysInMonth = 31;
        break;
      case 4 :
        MonthOfName = "April";
        number_Of_DaysInMonth = 30;
        break;
      case 5 :
        MonthOfName = "May";
        number_Of_DaysInMonth = 31;
        break;
      case 6 :
        MonthOfName = "June";
        number_Of_DaysInMonth = 30;
        break;
      case 7 :
        MonthOfName = "July";
        number_Of_DaysInMonth = 31;
        break;
      case 8 :
        MonthOfName = "August";
        number_Of_DaysInMonth = 31;
        break;
      case 9 :
        MonthOfName = "September";
        number_Of_DaysInMonth = 30;
        break;
      case 10 :
        MonthOfName = "October";
        number_Of_DaysInMonth = 31;
        break;
      case 11 :
        MonthOfName = "November";
        number_Of_DaysInMonth = 30;
        break;
      case 12 :
        MonthOfName = "December";
        number_Of_DaysInMonth = 31;
        break;
    }
  System.out.println(MonthOfName + " " + year + " has" + number_Of_DaysInMonth + " days\n");
  }
}