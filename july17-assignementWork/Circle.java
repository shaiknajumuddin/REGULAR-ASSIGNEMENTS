//Create a class called "Circle" with an instance variable for storing the radius. Implement a constructor that takes the radius as an argument and initializes the object.
class Circle
  {
    int radius;
    Circle(int r)
    {
      radius=r;
    }
    public void initializeRadius()
    {
      System.out.println("the radius is"+radius);
    }
    public static void main(String args[])
    {
      Circle c=new Circle(34);
      Circle c2=new Circle(56);
      Circle c3=new Circle(54);
      c.initializeRadius();
       c2.initializeRadius();
       c3.initializeRadius();
      
    }
  }