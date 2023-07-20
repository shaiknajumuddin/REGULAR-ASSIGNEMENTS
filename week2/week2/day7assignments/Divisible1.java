import java.util.*;
class Divisible1
  {
    public static void main(String args[])
    {
      int a,b;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter  first number");
      a=sc.nextInt();
      System.out.println("enter second number");
      b=sc.nextInt();
      if(a/b==0)
      {
        System.out.println("the first number is divisoble by second number");
      }
      else
      {
        
        System.out.println("the first number is not divisoble by second number");
      }
    }
  }