//Assignment 1: Single Inheritance
//Create a superclass called "Animal" with the following attributes:
//String name
//int age
//String breed

class Animal
  {
    String name;
    int age;
    String breed;
    void dog()
    {
      System.out.println("the name is"
+name);
    System.out.println("the age is"+age);
      System.out.println("the breed is"+breed);
  }
  }
class Babydog extends Animal
{
  void babydog()
  {
    System.out.println("the name is"+name);
    System.out.println("the age is"+age);
    System.out.println("the breed is"+breed);
  }
}
class Single
  {
    public static void main(String args[])
    {
      Babydog B=new Babydog();
      B.name="dolly";
      B.age=5;
      B.breed="dog";
      B.babydog();
      
    }
  }