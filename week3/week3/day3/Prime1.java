import java.util.*;
class Prime1
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
      int n=sc.nextInt();
      int  count=0;
      for(int i=1;i<=n;i++)
        {
          for(int j=1;j<=i;j++)
         {
          if(i%j==0)
          {
               count=count+1;  
           }
         }
          if(count==2)
            {
                System.out.println(i);
             }
       }
      
    }
  }