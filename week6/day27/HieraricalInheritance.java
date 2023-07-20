class Vehicle
  {
    void car()
    {
      System.out.println("driving the car");
    }
  }
class AmbasadderCar extends Vehicle
{
   void old()
  {
    System.out.println("its a old car");
  }
}
class InnovaCar extends Vehicle
{
  void ItsNew()
  {
    System.out.println("its a new Car");
  }
}
class HieraricalInheritance
  {
    public static void main(String args[])
    {
      InnovaCar I=new InnovaCar();
      AmbasadderCar A=new AmbasadderCar();
      A.old();
      A.car();
      I.car();
      
      I.ItsNew();
    }
  }