import java.util.*;
class Weeknumbersswitch {
  public static void main(String args[])
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a day number");
        int number=sc.nextInt();
        switch(number)
          {
            case 1:
              System.out.println("its monday");
              break;
            case 2:
              System.out.println("its tuesday");
              break;
            case 3:
              System.out.println("its wednesday");
              break;
            case 4:
              System.out.println("its thurday");
              break;
            case 5:
              System.out.println("its friday");
              break;
            case 6:
              System.out.println("its saturday");
              break;
            case 7:
              System.out.println("its sunday");
              break;
            default:
              System.out.println("entered day number is invalid");
          }
      }
}