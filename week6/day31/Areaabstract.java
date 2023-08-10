 abstract class Shape
  {
      abstract void calculateArea();   
  }

class Rectangle extends Shape
  {
    void calculateArea()
    {
      int length=20;
      int breadth=30;
        System.out.println("the area of rectangle is"+(length*breadth));
    }
  }
class Square extends Shape
  {
    void calculateArea()
    {
      int side=3;
      System.out.println("the area of sqaure is"+(side*side));
    }
  }
class Circle extends Shape
  {
    void calculateArea()
    {
      int radius=4;
      System.out.println("the area of circle is"+(0.5*radius*radius));
    }
  }
class Areaabstract
  {
    public static void main(String args[])
    {
      Rectangle rec=new Rectangle();
      Square sq=new Square();
      Circle cr=new Circle();
      
      rec.calculateArea();
      sq.calculateArea();
      cr.calculateArea();
  
    }
  }