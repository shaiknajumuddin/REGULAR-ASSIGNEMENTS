import java.util.*;
class Twodimen
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the row values");
      int row=sc.nextInt();
      System.out.println("enter the coloumn values");
      int col=sc.nextInt();
      int arr[][]=new int[row][col];
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            {
              arr[i][j]=sc.nextInt();
            }
        }
      System.out.println("the elements are");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            {
              System.out.println("the elements are"+arr[i][j]);
            }
        }
      System.out.println();
    }
    
  }