//Assignment 1: Single Inheritance

//Create a superclass called "Animal" with the following attributes:
//String name
//int age
//String breed

class Animal
  {
    void name()
    {
      String name="dolly";
      System.out.println("the name is"+name);
      
    }
    void age()
    {
      int age=5;
      System.out.println("the age is "+age);
    }
    void breed()
    {
     String breed="dog"; System.out.println("the breed is "+breed);
    }
  }
class Dog extends Animal
  {
    void show()
    {
      System.out.println("this is a dog");
    }
  }
  class Single1
    {
    public static void main(String args[])
    {
      Dog d=new Dog();
      d.name();
      d.age();
      d.breed();
      d.show();
    }
  }