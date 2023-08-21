import java.util.*;
class Arrayinsert
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
        int arr1[]=new int[size+1];
        System.out.println("enter the element you want to insert");
        int ele=sc.nextInt();
         
        System.out.println("enter the position you want to insert");
        int pos=sc.nextInt();
        for(int i=0;i<size+1;i++)
        {
            if(i==pos)
            {
                arr1[i]=ele;
            }
            else if(i>pos)
            {
                arr1[i]=arr[i-1];
            }
           else{
               arr1[i]=arr[i];
           }
        
            
        }
        for(int i=0;i<size+1;i++)
        {
        System.out.println(arr1[i]);
        }
    }
}
//9494906786