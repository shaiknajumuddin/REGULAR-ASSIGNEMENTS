//Create a class called "Car" with instance variables for storing the make, model, and year of a car. Implement a method named setCarDetails that takes arguments for each variable and initializes the object. Display the car's details using a separate method.

class Car1
  {
    String maker;
    String model;
    int year;
    public void setCardetails(String mk,String m,int y)
    {
      maker=mk;
      model=m;
      year=y;
    }
    public void display()
    {
      System.out.println("the maker is "+maker);
      System.out.println("the car model is"+model);
      System.out.println("the car year is "+year);
    }
    public static void main(String args[])
    {
      Car1 c=new Car1();
      Car1 c1=new Car1();
      Car1 c2=new Car1();
      c.setCardetails("nazeer","bmw",2002);
      c1.setCardetails("nazeem","maruthi",2002);
      c2.setCardetails("basha","suzuki",2002);
      c.display();
      c1.display();
      c2.display();
    }
  }