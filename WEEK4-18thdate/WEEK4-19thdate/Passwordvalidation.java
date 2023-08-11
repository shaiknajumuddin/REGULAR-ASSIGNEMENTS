import java.util.*;
class Passwordvalidation
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a password");
      String password =sc.nextLine();
      int alphacount=0,digitcount=0,splcount=0;
      char ch;
      for(int i=0;i<password.length();i++)
        {
           ch=password.charAt(i);
          if(password.length()>=8)
          {
            if(ch>='A'&& ch<='Z')
            {
              alphacount++;
            }
          }
          if(ch>='a'&& ch<='z')
          {
            alphacount++;
          }
          if(ch>='0'&&ch<='0')
          {
            digitcount++;
          }
          else
          {
            splcount++;
          }
        }
     if(alphacount>0&&digitcount>0&&splcount>0)
            {
              System.out.println("valid password");
            }
            else{
            System.out.println("enter a strong password");
            }
    }
     
    }