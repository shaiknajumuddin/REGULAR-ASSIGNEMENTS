class Abc
  {
    public void display()
    {
      System.out.println("the length is "+length);
      System.out.println("the breadth is "+breadth);
      
    }
    public static void main(String args[])
    {
      Abc s=new Abc();
    
      s.length=10;
      s.breadth=30;
      s.display();
    }
  }