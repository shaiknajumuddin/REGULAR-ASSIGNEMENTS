import java.util.*;
class Fibonacci
  {
    public static void main(String args[])
    {
      int first=0,second=1;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number upto how many yout want");
      int number=sc.nextInt();
      System.out.println(first+"");
      System.out.println(second+"");
      for(int i=1;i<=number;i++)
        {
          int third=first+second;
          System.out.println(third+"");
          first=second;
          second=third;
        }
   }
  }



 