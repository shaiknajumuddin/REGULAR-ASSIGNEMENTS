import java.util.*;
class Divisibleby5and11 {
  public static void main(String args[]) {
    int a;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter  number");
    a = sc.nextInt();
    if((a%5==0)&&(a%11==0)) 
    {
      System.out.println("the number is divisible by 5 and 11");
    } 
    else 
    {
      System.out.println("the number is not divisible by 5 and 11");
    }
  }
}