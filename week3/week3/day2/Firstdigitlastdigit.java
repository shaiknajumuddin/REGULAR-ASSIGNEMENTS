import java.util.*;
class Firstdigitlastdigit
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a value");
      int firstdigit=0;
      int n=sc.nextInt();
      int temp=n;
      while(n>0)
        {
           firstdigit=n%10;
          n=n/10;
        }
          System.out.println("print the number "+n);
          System.out.println("enter the first digit"+firstdigit);
          int lastdigit=temp%10;
          n=n/10;
          System.out.println("enter the lastdigit"+lastdigit);
        }
  }