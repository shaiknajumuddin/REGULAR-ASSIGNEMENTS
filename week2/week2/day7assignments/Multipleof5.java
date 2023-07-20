import java.util.*;

class Multipleof5 {
  public static void main(String argsp[]) {
    int a;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number ");
    a = sc.nextInt();
    if (a % 5 == 0) {
      System.out.println("the number is multiple of 5 ");
    } else {
      System.out.println("the number is not multiple of 5");
    }
  }
}