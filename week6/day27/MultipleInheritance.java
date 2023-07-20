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
class InnovaCar extends AmbasadderCar,Vehicle
{
  public static void main(String args[])
  {
    InnovaCar I=new InnovaCar();
    I.old();
  }
}