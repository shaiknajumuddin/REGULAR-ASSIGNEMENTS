/*Assignment 5: Custom Unchecked Exception Build a simple calculator program in Java. Create a custom unchecked exception called CalculatorException. This exception should be thrown when any invalid mathematical operation or input is provided to the calculator (e.g., division by zero, invalid operator, etc.). Implement the calculator's functionality and handle the CalculatorException in a way that displays an appropriate error message.*/
import java.util.*;
class CalculatorException extends Exception
  {
    CalculatorException(int a)
    {
      super(a);
      {
        if(num/0)
        {
          throw new CalculatorException("invalid operator");
        }
        else{
          System.out.println("valid operator");
        }
      }
    }
  }
class Calculator
  {
    public static void main(String args[]) throws CalculatorException
  }
