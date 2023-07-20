class Rectangle
  {
    int length;
    int width;
    int area;
    int perimeter;
    public void display()
    {
      System.out.println("length is "+length);
      System.out.println("width is"+width);
      area=length*width;
      perimeter=2*(length*width);
      System.out.println("the area is "+area);
       System.out.println("the perimter is "+perimeter);
    }
    public static void main(String  args[])
    {
      Rectangle rectangle=new Rectangle();
      rectangle.length=120;
      rectangle.width=30;
      
      rectangle.display();
     }
  }