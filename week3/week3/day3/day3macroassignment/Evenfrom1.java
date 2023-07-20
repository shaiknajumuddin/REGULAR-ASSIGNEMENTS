import java.util.*;
class Evenfrom
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the first number");
 int first=sc.nextInt();
 System.out.println("enter the last number");
 int last=sc.nextInt();
 for(int i=first;i<=last;i++)
{
if(i%2==0)
{
 System.out.println(+i);
}
}

}
}