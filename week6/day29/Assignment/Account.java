//1. ATM Simulator: Create a class called "Account" that represents a bank account. The class should have properties such as account number, balance, and account holder name, and methods such as deposit, withdraw and check balance. Create another class called "ATMSimulator" that represents an ATM machine. The class should have a list of accounts, and methods such as addAccount, removeAccount, and transact.
class Account
  {
  long accountno=121221212;
    double balance=5000.0;
    String holdername="nazeer";
    void deposite()
    {
      int deposite=1000;
      double total=balance+deposite;
      System.out.println("enter the deposite money"+deposite);
      System.out.println("after deposite"+total);
    }
    void withdraw()
    {

      int withdraw=1500;
      double total=balance-withdraw;
      System.out.println("enter the withdraw money"+withdraw);
System.out.println("after withdraw"+total);
    }
    void checkbalance()
    {
      System.out.println("enter the account no"+accountno);
    }
  }
class 
class Banking 
  {
    public static void main(String args[])
    {
      Account a=new Account();
      a.withdraw();
      a.deposite();
      
    }
  }
    
    
  