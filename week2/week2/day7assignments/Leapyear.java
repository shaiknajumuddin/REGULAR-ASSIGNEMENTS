import java.util.*;
class Leapyear
  {
    public static void main(String args[])
    {
      int year;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a year");
      year=sc.nextInt();
      if(year%4==0)
      {
        System.out.println("the year is a leapyear");
      }
      else
      {
        System.out.println("the year is not a leapyear");
      }
    }
  }