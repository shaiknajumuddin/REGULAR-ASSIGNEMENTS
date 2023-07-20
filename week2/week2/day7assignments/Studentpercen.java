import java.util.*;

class Studentpercen {
  public static void main(String args[]) {
    int phy, math, comp;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter phy marks");
    phy = sc.nextInt();
    System.out.println("enter math marks");
    math = sc.nextInt();
    System.out.println("enter comp marks");
    comp = sc.nextInt();
    double total = phy + math + comp;
    double percentage = ((total / 100) * 300);
    if (percentage >= 90) {
      System.out.println("print the grade is A");
    } else if (percentage >= 80 && percentage <= 89) {
      System.out.println("print the grade is B");
    } else if (percentage >= 70 && percentage <= 79) {
      System.out.println("print the grade is C");
    } else if (percentage >= 60 && percentge <= 69) {
      System.out.println("print the grade is D");
    } else if (percentage >= 40 && percentage <= 59) {
      System.out.println("print the grade is E");
    } else {
      System.out.println("print the grade is F");
    }

  }
}