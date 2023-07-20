import java.util.*;
class Copyelement
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the array");
      int size=sc.nextInt();
      int a[]=new int[size];
      int b[]=new int[size];
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt(); 
        }
      for(int i=0;i<size;i++)
        {
          a[i]=b[i];
        }
      System.out.println("elements in a[]");
      for(int i=0;i<size;i++)
        {
          System.out.println(a[i]+"");
        }
      System.out.println("elements in b[]");
      for(int i=0;i<size;i++)
        {
          System.out.println(b[i]+"");        
        }
      
      
    }
  }