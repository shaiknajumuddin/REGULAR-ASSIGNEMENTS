class Animal
  {
    void eat()
    {
      System.out.println("eating");
    }
  }
class Horse extends Animal
{
  void run()
  {
    System.out.println("the horse run fast");
  }
}
class SingleInheritance 
  {
    public static void main(String args[])
    {
      Horse h=new Horse();
      h.run();
      h.eat();
    }
  }