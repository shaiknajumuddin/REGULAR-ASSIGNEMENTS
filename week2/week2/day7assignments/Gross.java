/*WAP to input basic salary of an employee and calculate its Gross     salary according to following:
    Basic Salary <= 10000 : HRA = 20%, DA = 80%
    Basic Salary <= 20000 : HRA = 25%, DA = 90%
    Basic Salary > 20000 : HRA = 30%, DA = 95%*/

import java.util.*;
class Gross
  {
    public static void main(String args[])
    {
      double basic,HRA,DA;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter basic salary");
      basic=sc.nextDouble();
      if(basic<=10000)
      {            
               HRA=(10000*0.2);
                DA=(10000*0.8);
         double gross=basic+HRA+DA;
                System.out.println("the gross salary is" +gross);
      }
      else if(basic<=20000)
      {
        HRA=(20000*0.25);
         DA=(20000*0.1);
        double gross=basic+HRA+DA;
        System.out.println("the gross salary is"+gross);
       }
       else(basic>20000)
       {
         HRA=(20000*0.3);
         DA=(20000*0.95);
         double gross=basic+HRA+DA;
         System.out.println("the gross salary is "+gross);
         
       }
        
  }
  }