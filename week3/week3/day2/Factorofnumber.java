import java.util.*;
class Factorofnumber
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int n=sc.nextInt();
      int i;
      for(i=1;i<=n;i++)
        {
          if(n%i==0)
          {
            System.out.println(+i);
          }
        }
    }
  }