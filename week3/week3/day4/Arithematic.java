import java.util.*;
class Arithematic
  {
    public static void additionOperator(int num1,int num2)
  {
   int result=num1+num2;
    System.out.println(result);
  }
  public static void subtractionOperator(int num1,int num2)
    {
      int result=num1-num2;
      System.out.println(result);
    }
    public static void multiplicationOperator(int num1,int num2)
    {
      int result=num1*num2;
       System.out.println(result);
    }
   public static void divisionOperator(int num1,int num2)
    {
      int result=num1/num2;
      System.out.println(result);
    }
    public static void moduloDivisionOperator(int num1,int num2)
    {
      int result=num1%num2;
         System.out.println(result);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter num1 value");
      int num1=sc.nextInt();
      System.out.println("enter num2 value");
      int num2=sc.nextInt();
      additionOperator(num1,num2);
      subtractionOperator(num1,num2);
      multiplicationOperator(num1,num2);
      divisionOperator(num1,num2);
      moduloDivisionOperator(num1,num2);
    }
  }
    