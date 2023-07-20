import java.util.*;
class Calculatorswitch
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a value");
      int a=sc.nextInt();
      System.out.println("enter b value");
      int b=sc.nextInt();
      System.out.println("enter a operator");
      char ch=sc.next().charAt(0);
      switch(ch)
        {
          case '+':
            System.out.println("in addition of the numbers is"+(a+b));
            break;
          case '-':
            System.out.println("the subtraction of the numbers is"+(a-b));
            break;
          case '*':
            System.out.println("the multiplication od the number is"+(a*b));
            break;
          case '/':
            System.out.println("the division of the number is"+(a/b));
            break;
          case '%':
            System.out.println("the remainder of the number is "+(a%b));
              break;
          default:
            System.out.println("invalid operator ");
        }
    }
  }
            
        