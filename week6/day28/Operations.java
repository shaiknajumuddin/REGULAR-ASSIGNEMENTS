/*Design a class MathOperations with a method calculate that performs different arithmetic operations (addition, subtraction, multiplication, division) on two integers and returns the result. Implement method overloading to support the following cases:

Perform addition.
Perform subtraction.
Perform multiplication.
Perform division.*/
  
class MathOperations
  {
    void calculate(int a,int b)
    {
      System.out.println("the addition is "+(a+b));
      
    }
    void calculate(int a,int b,int c)
    {
      System.out.println("the subtraction is "+(a-b-c));
    }
    void calculate(int a,int b,int c,float d)
    {
      System.out.println("the multiplication is"+(a*b*c*d));
    }
    void calculate(int a,float b)
    {
      System.out.println("the division is "+(a/b));
    }
  }
class Operations
  {
    public static void main(String args[])
    {
      MathOperations m=new MathOperations();
      m.calculate(2,3);
      m.calculate(2,3,4);
      m.calculate(3,4,5,34.3f);
      m.calculate(4,2.1f);
    }
  }