import java.util.*;
class Rps
  {
    public static void main(String args[])
    {
      char user,comp;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter user value:r or p or s");
      user=sc.next().charAt(0);
      System.out.println("enter comp value:r or p or s");
      comp=sc.next().charAt(0);
      if(user=='r'&&comp=='p')
      {
        System.out.println("computer will wins");
      }
      else if(user=='r'&&comp=='s')
      {
        System.out.println("user will wins");
      }
      else if(user=='s'&&comp=='r')
      {
        System.out.println("comp will wins");
      }
      else if(user=='p'&&comp=='r')
      {
        System.out.println("user will wins");
      }
      else if(user=='p'&&comp=='s')
      {
        System.out.println("comp will wins");
      }
      else if(user=='s'&&comp=='p')
      {
        System.out.println("user will wins");
      }
   }
  }