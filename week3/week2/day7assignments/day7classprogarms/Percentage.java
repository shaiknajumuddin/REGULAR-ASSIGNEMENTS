import java.util.Scanner;
class Percentage
  {
    public static void main(String args[])
    {
      double total_marks,maximum_marks;
      double Percentage;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter maximum_marks");
      System.out.println("enter total_marks");
       total_marks=sc.nextInt();
       double percentage=((maximum_marks/total_marks)*100);
      System.out.println("percentage is"+percentage);
    }
  }