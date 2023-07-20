import java.util.*;
class MultipleIFs
  {
    public static void main(String args[])
    {
     int a;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a value");
      a=sc.nextInt();
      if(a<=5)
      {
        if(a==3)
        {
          System.out.println("bhavani kiranmai");
        }
        if(a<3)
        {
          System.out.println("saritha");
        }
        else
        {
          System.out.println("hi");
        }
      }
      else
      {
        System.out.println("hi ra mowa");
      }
    }
  }