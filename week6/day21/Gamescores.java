import java.util.Scanner;
class Gamescores
  {
    public static void main(String args[])
    {
    int a,b;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the team a and team b no of games played");
       a=sc.nextInt();
       b=sc.nextInt();
      int arr1[]=new int[4];
      System.out.println("enter scores of teamA");
      for(int i=0;i<arr1.length;i++)
        {
          arr1[i]=sc.nextInt();
        }
      int avg=arr1[i]/4;
      System.out.println(avg);
      int arr2[]=new int[4];
      System.out.println("enter scores of teamB");
      for(int j=0;j<arr2.length;j++)
        {
          arr2[j]=sc.nextInt();
        }
      int avg1=arr2[j]/4;
      System.out.println(avg1);
    }
  
}
      
      
      
    
  