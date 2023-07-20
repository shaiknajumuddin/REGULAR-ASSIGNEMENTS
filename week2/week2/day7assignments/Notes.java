import java.util.*;
class Notes
  {
    public static void main(String args[])
    {
      int amount;
      int N500=0,N200=0,N100=0,N50=0,N20=0,N10=0,N5=0,N2=0,N1=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a Note");
       amount=sc.nextInt();
      if(amount>=500)
      {
        N500=amount/500;
        amount=amount%N500;
        System.out.println("print the note is 500");
      }
      else if((amount>=200)||(amount<500))
      {
        N200=amount/200;
        amount=amount%N200;
        System.out.println("print the note is 200");
      }
      else if((amount>=100)||(amount<200))
      {
        N100=amount/100;
        amount=amount%N100;
        System.out.println("print the note is 100");
      }
      else if((amount>=50)||(amount<100))
      {
        N50=amount/50;
        amount=amount&50;
        System.out.println("print the note is 50");
      }
      else if((amount>=2)||(amount<50))
      {
        N2=amount/2;
        amount=amount%2;
        System.out.println("print the note is2");
      }
    }
  }
        