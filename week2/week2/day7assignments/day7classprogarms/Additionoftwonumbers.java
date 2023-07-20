import java.util.Scanner;
class Additionoftwonumbers
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a,b;
      System.out.println("enter a value:");
      a=sc.nextInt();
      System.out.println("enter b value");
      b=sc.nextInt();
      int c=a+b;
      System.out.println("the sum is " +c);
      
    }
  }