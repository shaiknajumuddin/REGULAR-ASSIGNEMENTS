import java.util.*;
class Maximum
  {
    public static void main(String args[])
    {
      int a,b,c;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a value");
      a=sc.nextInt();
      System.out.println("enter b value");
      b=sc.nextInt();
      System.out.println("enter c value");
      c=sc.nextInt();
      if((a>b)&&(a>c))
      {
        System.out.println("a has maximum value");
      }
      if((b>a)&&(b>c))
      {
        System.out.println("b has maximum value");
      }
      else
      {
        System.out.println("c has a maximum value");
      }
   }
  }