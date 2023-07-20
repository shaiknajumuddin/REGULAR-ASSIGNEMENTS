import java.util.*;
class Evenodd1
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size");
      int size=sc.nextInt();
      int arr[]=new int[size];
      System.out.println("enter the arrry elements");
      int n=sc.nextInt();
      for(int i=0;i<size;i++)
        {
          arr[i]=sc.nextInt();
        }
      for(int i=0;i<size;i++)
        {
          if(arr[i]%2==0)
          {
            System.out.println("the elements are even");
          }
          else
          {
            System.out.println("the elements are odd");
          }
        }
        
   }
  }