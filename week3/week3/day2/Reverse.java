import java.util.Scanner;
class Reverse
  {
    public static void main(String args[])
    {   
     //number= 567
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int number=sc.nextInt(); //893
      int reverse=0; 
      while(number>0)//893>0 //89>0   //8>0  //0>0-stop
        {
          int digit=number%10; //digit=3 //89%10 = 9  //8%10=8
          reverse=(reverse*10)+digit; //(0*10)+3 =3 // (3*10)+9=39 //(39*10)+8 = 398
          number=number/10; //893/10=89 //89/10=8 //8/10=0
          
        }
      System.out.println("reverse number is "+reverse);
    }
  }