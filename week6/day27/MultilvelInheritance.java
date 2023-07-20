class Vehicle
  {
    void drive()
    {
      System.out.println("driving");
    }
  }
class AmbasadderCar extends Vehicle
{
  void old()
  {
    System.out.println("its a old version car");
  }
}
class InnovaCar extends AmbasadderCar
{
  void itsNew()
  {
    System.out.println("its a new version car");
  }
}
 class MultilevelInheritance
  {
    public static void main(String args[])
      {
        Innova I=new Innova();
        I.drive();
        I.old();
        I.itsNew();
      }
    }
