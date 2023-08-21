import java.util.*;
class Avgarray
{
    public static void main(String args[])
    {
   int  avg;
   Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of an array");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("enter the array elements");
    for(int i=0;i<size;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println("the average of array elements are");
    int sum=0;
    for(int i=0;i<size;i++)
    {
     sum=sum+arr[i];
     
    }
    avg=sum/size;
    System.out.println("the average is "+avg);
    }
}