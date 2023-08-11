import java.util.*;
class Palindrome
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      String s="";
      for(int i=0;i<str.length();i++)
        {
          char ch=str.charAt(i);
          s=ch+s;
        }
      if(str.equals(s))
      {
        System.out.println("given string is palindrome");
      }
      else
      {
        System.out.println("given string is not palindrome");
      }
  }
  }