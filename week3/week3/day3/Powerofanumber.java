import java.util.*;
class Powerofanumber
  {
    public static void main(String args[])
    
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter power value");
      int num=sc.nextInt();
      System.out.println("enter base value");
      int base=sc.nextInt();
      int result=1;
      for(int i=1;i<=num;i++)
        {
          result=result*base;
        }
      System.out.println(result);
    }
  }


