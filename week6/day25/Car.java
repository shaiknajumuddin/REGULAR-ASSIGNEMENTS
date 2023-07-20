//Create a class called "Car" with instance variables for storing the make, model, and year of a car. Implement a constructor that initializes these variables and display the car's details.

class Car
  {
    String model;
    int year;
    public void display()
    {
      System.out.println("the model of car is "+model);
      System.out.println("the year of car is"+year);
    }
    public static void main(String args[])
    {
      Car c1=new Car();
      Car c2=new Car();
      Car c3=new Car();
      c1.model="swift";
      c1.year=2000;
      c2.model="verna";
      c2.year=2001;
      c3.model="balano";
      c3.year=2003;
      c1.display();
      c2.display();
      c3.display();
      
    }
  }
  