import java.util.*;
class Sortarray
{
    public static void main(String args[])
    {
        int temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array elements");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the array elements");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("after the inserting an elements in sorted order");
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(arr[j]<arr[i])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}