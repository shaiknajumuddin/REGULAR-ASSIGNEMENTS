import java.util.*;
class Digit
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
      int n=sc.nextInt();
      while(n>0)
        {
          int digit=n%10;
          System.out.println(digit);
          n=n/10;
        }
  }
  }