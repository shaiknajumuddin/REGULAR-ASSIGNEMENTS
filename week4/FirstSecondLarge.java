import java.util.*;
class FirstSecondLarge
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the array elements");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int large1=arr[0];
        int large2=arr[1];
        if(large1<large2)
        {
            int temp=large1;
            large1=large2;
            temp=large2;
        }
        for(int i=2;i<size;i++)
        {
        if(large1<arr[i])
        {
            large1=large2;
            large1=arr[i];
            
        }
        else if(large2<arr[i])
        {
            large2=arr[i];
        }
        }
        
            System.out.println("first largest value is "+large1);
            System.out.println("second largest value is "+large2);
        
    }
}