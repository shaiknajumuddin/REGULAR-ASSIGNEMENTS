//when we have the same method name of parent class and child class then we use the super keyword to avoid the confusion to jvm (EX: super.methodname())
class Student
  {
    int roolno=20;
    String name="nazeer";
    void display()
    {
      System.out.println(roolno+""+name);
    }
  }
class Stud extends Student
{
  int roolno=3;
  String name="sameen";
  void display()
  {
    System.out.println(roolno+""+name);
   
  }
  void print()
  {
    System.out.println("the studetn details");
    super.display();
    System.out.println("the stud details");
    display();
  }
}
class Super1
  {
    public static void main(String args[])
    {
      Stud s=new Stud();
      s.print();
    }
  }