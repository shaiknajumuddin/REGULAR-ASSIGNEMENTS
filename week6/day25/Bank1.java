class Bank
{
 String name;
float balance;
public void initalizeAccount(String n,float b)
{
  name=n;
  balance=b;
}
public void display()
{
 System.out.println("account holders name is"+name);
System.out.println("account balance is"+balance);
 Bank bank1=new Bank();
 Bank bank2=new Bank();
 bank1.initalizeAccount("nazeem",6000);
 bank2.initalizeAccount("kiranmai",10000);
 bank1.display();
  bank2.display();

    }

  }