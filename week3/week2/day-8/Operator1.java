import java.util.*;
class Operator1
  {
    public static void main(String args[])
    {
      int a,b;
      char operator;
      Scanner sc=new Scanner(System.in);
      System.out.println("select operator :'+','-','*','/','%'");
      operator=sc.next().charAt(0);
      System.out.println("enter a value");
      a=sc.nextInt();
      System.out.println("enter b value");
      b=sc.nextInt();
        if(operator=='+')
        {
          int result=(a+b);
          System.out.println("result");
        }
        else if(operator=='-')
        {
          int result=(a-b);
          System.out.println("result");
        }
        else if(operator=='*')
        {
          int result=(a*b);
          System.out.println("result");
        }
        else if(operator=='/')
        {
          int result=(a/b);
          System.out.println("result");
        }
        else if(operator=='%');
        {
         int result=(a%b);
          System.out.println("result");
        }
      
    }
  }