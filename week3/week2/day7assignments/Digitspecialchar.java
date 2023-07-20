import java.util.*;
class Digitspecialchar
  {
    public static void main(String args[])
    {
      char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter character");
      ch=sc.next().charAt(0);
            if((ch>='a')&&(ch<='z'))
      {
        System.out.println("this is a character");
      }
      else if((ch<='9')&&(ch>='0'))
      {
        System.out.println("the numeber is a digit");
      }
       else
      {
        System.out.println("special character");
      }
      }
  }