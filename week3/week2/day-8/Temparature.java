import java.util.*;
class Temparature
  {
    public static void main(String args[])
    {
      double celsius,fahrenheit;
      double temparature;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter temparature");
      temparature=sc.nextDouble();
      System.out.println("enter clecius value ");
      celsius=sc.nextDouble();
      System.out.println("enter fahrenheit value");
      fahrenheit=sc.nextDouble();
      if(temparature==celsius)
      {
       fahrenheit = ((celsius*1.8)+32);
        System.out.println("conevert into fahrenheit"+fahrenheit);
      }
      else if(temparature==fahrenheit)
      {
       celcius = 5/9*(fahrenheit-32);
        System.out.println("convert into celsius"+celsius);
      }
    }
  }