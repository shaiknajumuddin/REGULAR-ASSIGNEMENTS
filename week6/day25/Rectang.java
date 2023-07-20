import java.util.*;
class Rectang
  {
    int length;
    int width;
    int area;
    int perimeter;
    public void display()
    {
      
      
      System.out.println("area is"+(length*width));
      System.out.println("perimeter is"+(2*(length*width)));
    }
    public static void main(String args[])
    {
      Rectang rec=new Rectang();
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the length");
      int length=sc.nextInt();
      System.out.println("enter the width");
      int width=sc.nextInt();
     
      rec.display();
      
      
    }
  }