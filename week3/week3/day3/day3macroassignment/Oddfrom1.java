import java.util.*;
class Oddfrom
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number from which range u want");
      int first=sc.nextInt();
      System.out.println("enter the number from where  want to end");
      int last=sc.nextInt();
      for(int i=first;i<=last;i++)
        {
          if(i%2!=0)
          {
            System.out.println(i);
          }
        }
    }
  }