/*Assignment 1: Method Overloading

Create a class StringHelper with a method concatenate that concatenates two strings and returns the result. Implement method overloading for concatenate to handle the following cases:

Concatenate two strings.
Concatenate three strings.
Concatenate a list of strings.*/
import java.util.*;
class StringHelper
  {
    void concateneate()
    {
      
      System.out.println("the concatenation is");
    }
    void concatenate(String a,String b)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter two strings");
      a=sc.next();
      b=sc.next();
      System.out.println("after insertion");
      System.out.println("the concatenation is"+(a+b));
    }
    void concatenate(String a,String b,String c)
    {
      System.out.println("the three strings concatenation is"+(a+b+c));
    }
    void concatenate()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the four strings");
      String s1=sc.next();
      String s2=sc.next();
      String s3=sc.next();
      String s4=sc.next();
      System.out.println("after the insertion");
      String st=s1.concat(s2);
      String st1=st.concat(s3);
      String st2=st1.concat(s4);
      System.out.println(st2);
    }
    
  }
class Method
  {
    public static void main(String args[])
    {
      StringHelper h=new StringHelper();
      h.concatenate("nazeer","sameen");
      h.concatenate("shabreen","saritha","tanya");
      h.concatenate();
    }
  }