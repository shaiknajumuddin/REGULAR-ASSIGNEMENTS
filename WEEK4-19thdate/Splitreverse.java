import java.util.*;
class Splitreverse
  {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string");
    String str=sc.nextLine();
    String s[]=str.split("");
    String rev="";
    for(int i=s.length-1;i>=0;i--)
      {
        rev=rev+s[i];
      }
      System.out.println(rev);
    }
  }