import java.util.*;
class Alphabet
{
 public static void main(String args[])
  {
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a value");
    ch=sc.next().charAt(0);
    for(ch='a';ch<='z';ch++)
    {
     System.out.println(ch);
    }
  }
}