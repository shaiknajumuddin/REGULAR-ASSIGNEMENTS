import java.util.*;
class Palindromeornot
  {
    public static void main(String args[])
    {
     int num,temp,reverse=0,digit=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      num=sc.nextInt();
      temp=num;
      while(num>0)
        {
          digit=num%10;
          reverse=(reverse*10)+digit;
        }
      if(temp==reverse)
      {
        System.out.println("the given number is a palindrome");
      }
      else
      {
        System.out.println("the given number is not a palindrome");
        
      }
      
    }
  }