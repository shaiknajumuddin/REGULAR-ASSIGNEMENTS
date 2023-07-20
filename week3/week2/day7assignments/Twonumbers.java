import java.util.*;
class Twonumbers
  {
    public static void main(String args[])
    {
      int a,b;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter first integers");
       a=sc.nextInt();
      System.out.println("enter second integer");
      b=sc.nextInt();
      if(a==b)
      {
        System.out.println("twonumbers are equal");
      }
      else 
      {
       System.out.println("two numbers are not equal");
      }
    }
  }