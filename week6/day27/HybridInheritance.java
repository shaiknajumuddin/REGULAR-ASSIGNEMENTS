class Grandfather
  {
    void old()
    {
      System.out.println("grandfather");
    }
  }
class father extends Grandfather
{
   void real()
  {
    System.out.println(" son from grandfather ");
  }
}
class son extends father
  {
    void now()
    {
      System.out.println("is son");
    }
  }
class daughter extends father
  {
    void now1()
    {
      System.out.println("is daughter");
    }
  }
class HybridInheritance
  {
    public static void main(String args[])
    {
      daughter d=new daughter();
      d.now1();
      d.now();
      d.real();
      d.old();
    }
  }