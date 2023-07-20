import java.util.*;
class Replac1
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      String s="";
      System.out.println(str.replaceAll("[()]",""));
    }
  }