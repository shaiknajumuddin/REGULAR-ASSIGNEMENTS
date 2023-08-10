class MethodOverloading
  {
    void area()
    {
      System.out.println("shapes ");
    }
    void area(int length,int breadth)
    {
      System.out.println("the area of a rectangle is "+length*breadth);
    }
    void area(double r,double pie)
    {
      System.out.println("the area of a circle is "+(pie*r*r));
    }
    void area(int side)
    {
      System.out.println("the area of a square is "+side*side);
    }
    void area(int base,double height)
    {
     System.out.println("the area of a triangle is "+(0.5*base*height)); 
    }
  }
class Shape
  {
    public static void main(String args[])
    {
      MethodOverloading m=new MethodOverloading();
      m.area();
      m.area(4,54);
      m.area(4.5,6.0);
      m.area(6);
      m.area(145,56.4);
    }
  }