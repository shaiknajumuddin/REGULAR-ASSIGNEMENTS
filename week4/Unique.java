import java.util.*;
class Unique 
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
        System.out.println("the unique elements are");
        for(int i=0;i<size;i++)
        {
            int count=0;
            for(int j=i+1;j<size;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
             if(count==0)
                {
                    System.out.println(arr[i]);
                }
            
        }
    }
}