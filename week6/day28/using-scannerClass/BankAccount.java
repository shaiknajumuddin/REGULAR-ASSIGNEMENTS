/*Assignment 3: Method Overloading and Overriding Combined

Create a class BankAccount with methods deposit and withdraw. Implement method overloading to handle different variations of deposit and withdraw methods:

deposit(amount): Deposits the given amount.
deposit(amount, description): Deposits the given amount with a provided description.
withdraw(amount): Withdraws the given amount.
withdraw(amount, description): Withdraws the given amount with a provided description.*/
class BankAccount
  {
    void deposite(int balanceamount)
    {
      int deposite=1000;
      System.out.println("total balance amount is"+balanceamount);
     deposite=deposite+balanceamount;
      System.out.println("after dipositing "+deposite);
    }
    void deposite(int amount,String description)
    {
      System.out.println("the amount " +deposite+ "deposited"+description);
    }
    void withdraw(int amount)
    {
     amount=2000;
      if(amount>withdraw)
      {
     withdraw=amount-withdraw;
      System.out.println("after withdraw"+withdraw);
    }
    void withdraw(int amount,String description)
    {
      System.out.println("the amount  "+amount+"withdraw"+description);
    }
  }
class Bank
  {
    public static void main(String args[])
    {
      BankAccount b=new BankAccount();
      b.deposite(10000);
      b.deposite(10000,"successfully");
      b.withdraw(40000);
      b.withdraw(40000,"successful");
    }
  }