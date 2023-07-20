import java.util.*;
class Divisibleby3
{
 public static void main(String args[])
  {
  int num;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the numbers from 1 to 50");
  num=sc.nextInt();
  for(i=3;i<=num;i++)
    {
      if(i%3==0)
      {
        System.out.println(i);
      }
    }
  }
}