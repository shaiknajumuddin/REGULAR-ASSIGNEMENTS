
class Shape
  {
    int len=10;
    int bre=40;
    int height=49;
    int base=23;
    int radius=45;
    int side=46;
    void area()
    {
      System.out.println("shapes ");
    }
  }
class Rectangle extends Shape
  {
    void area()
    {
      
      System.out.println("the area of a rectangle is "+(len*bre));
    }
  } 
class Circle extends Shape
  {
    void area()
    {
      
      
      System.out.println("the area of a circle is "+(3.14*radius*radius));
    }
  }
class Square extends Shape
  {

    void area()
    {
      
      System.out.println("the area of a square is "+(side*side));
    }
  }
class Triangle extends Shape
  {
    void area()
    {
      
     System.out.println("the area of a triangle is "+(0.5*base*height)); 
    }
  }
class Shape1
  {
    public static void main(String args[])
    {
      Shape s=new Shape();
      s.area();
      Shape rectangle=new Rectangle();
      rectangle.area();
      Shape circle =new Circle();
      circle.area();
      Shape square=new Square();
      square.area();
      Shape triangle=new Triangle();
      triangle.area();
      
    }
  }