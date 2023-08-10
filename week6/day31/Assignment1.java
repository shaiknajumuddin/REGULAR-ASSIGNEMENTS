import java.util.*;
abstract class Shape
  {
      abstract void getArea();
      abstract void getPerimeter();
  }

class Rectangle extends Shape
  {
    int length,breadth;
    void getArea()
    {
    
        System.out.println("the area of rectangle is"+(length*breadth));
    }
    void getPerimeter()
    {
      System.out.println("the perimeter of rectangle"+2*(length+breadth));
    }
  }
class Triangle extends Shape
  {
    int base,height,side1,side2,side3;
    void getArea()
    {
      
      System.out.println("the area of sqaure is"+(0.5*base*height));
    }
    void getPerimeter()
    {
      System.out.println("the perimeter of triangle is"+(side1+side2+side3));
    }
  }
class Circle extends Shape
  {
    int radius;
    void getArea()
    {
  
      System.out.println("the area of circle is"+(0.5*radius*radius));
    }
    void getPerimeter()
    {
      System.out.println("the perimeter of circle is"+(2*3.14*radius));
    }
  }
class Assignment1
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("the area of shapes are");
      System.out.println("the length ");
      int length=sc.nextInt();
      System.out.println("the breadth is");
      int breadth=sc.nextInt();
      System.out.println("the bese is");
      int base=sc.nextInt();
      System.out.println("the height is ");
      int height=sc.nextInt();
      System.out.println("the side1 is");
      int side1=sc.nextInt();
      System.out.println("the side2 is");
      int side2=sc.nextInt();
      System.out.println("the side3 is");
      int side3=sc.nextInt();
      System.out.println("the radius is");
      int radius=sc.nextInt();
      Circle c=new Circle();
      Rectangle a=new Rectangle();
      Triangle t=new Triangle();
      c.getArea();
      c.getPerimeter();
      a.getArea();
      a.getPerimeter();
      t.getArea();
      t.getPerimeter();
      
 }
  }