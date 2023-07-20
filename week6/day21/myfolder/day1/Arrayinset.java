import java.util.*;
class Arrayinset
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array size");
    int size=sc.nextInt();
      System.out.println("enter the elements");
    int n=sc.nextInt();
    int arr[]=new int[size];
   for(int i=0;i<size;i++)
     {
        arr[i]=sc.nextInt();
     }
    
    System.out.println("enter the location of element");
    int location=sc.nextInt();
    System.out.println("enter the element you want to insert");
    int element=sc.nextInt();
    for(int i=size;i>location;i--)
      {
         arr[i-1]=arr[i];
      }
    arr[location]=element;
    for(int i=0;i<=size;i++)
      {
    System.out.println(arr[i]);
      }
  }
}