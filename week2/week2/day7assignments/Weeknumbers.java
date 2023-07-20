/* WAP  WAP to input week number and print week day.*/

import java.util.*;
class Weeknumbers
  {
    public static void main(String args[])
    {
      int weeknumber;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter weeknumber");
      weeknumber=sc.nextInt();
      if((weeknumber<1)||(weeknumber>7))
      {
        System.out.println("print Invalid request");
      }
      else if(weeknumber==1)
      {
        System.out.println("today is monday");
      }
      else if(weeknumber==2)
      {
        System.out.println("today is tuesday");
      }
      else if(weeknumber==3)
      {
        System.out.println("toaday is wednesday");
      }
      else if(weeknumber==4)
      {
        System.out.println("today is thursday");
      }
      else if(weeknumber==5)
      {
        System.out.println("today is friday");
      }
      else if(weeknumber==6)
      {
        System.out.println("today is saturday");
      }
      else if(weeknumber==7)
      {
        System.out.println("today is sunday");
      }
      
    }
  }

