import java.util.*;
class Sumarray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("the enter the array elements");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("the sum of array elemets are");
        int sum=0;
        for(int i=0;i<size;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}