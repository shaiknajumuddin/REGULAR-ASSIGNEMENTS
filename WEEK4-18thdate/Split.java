import java.util.*;
class Split
  {
    public static void main(String args[])
    {
      String s="welcome to bitlabs internship";
      String str[]=s.split("");
      for(int i=0;i<str.length;i++)
        {
          System.out.println(str[i]);
        }
      
    }
  }