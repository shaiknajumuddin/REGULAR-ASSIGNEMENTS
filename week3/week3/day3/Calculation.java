import java.util.Scanner;
class Calculation
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      char option;
      
      do{
        System.out.println("select the operator");
        System.out.print(" + --> Addition"+"\n" + " - ---> Subtraction"+"\n" +"* --> Multplication"+"\n"+"/ - division" );
        char ch=sc.next().charAt(0);
         System.out.println("enter a and b values");
          int a=sc.nextInt();
          int b=sc.nextInt();
        switch(ch)
          {
            case '+':
              int result=a+b;
              System.out.println(+(a+b));
              break;
          }
        switch(ch)
          {
            case '-':
              int result=a-b;
              System.out.println(+(a-b));
              break;
          }
        switch(ch)
          {
            case '*':
              int result=a*b;
              System.out.println(+(a*b));
              break;
          }
        switch(ch)
          {
            case '/':
              int result=a/b;
              System.out.println(+(a/b));
              break;
          }
        switch(ch)
          {
            case '%':
              int result=a%b;
              System.out.println(+(a%b));
              break;
          }
           default:
           System.out.println("invalid operator");
           break;
      }
        System.out.println("do you want to continue: (y/n)");
        option=sc.next().charAt(0);
    }
        while(option=='y'||option=='Y');
    }
  }