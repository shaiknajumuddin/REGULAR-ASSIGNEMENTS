import java.util.*;
class Naturalnumbers
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the first number from where from you want");
      int first=sc.nextInt();
      System.out.println("enter the last number from where want to end");
      int last=sc.nextInt();
      for(int i=first;i<=last;i++)
        {
          System.out.println(i);
        }
    }
  }