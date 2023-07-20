import java.util.*;
class Sumofdigit
  {
    public static void main(String args[])
    { 
      int digit,sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a digit");
      int n=sc.nextInt();
      while(n>0)
        {
          digit=n%10;
          sum=sum+digit;
          n=n/10;
          System.out.println(+sum);
        }
    }
  }