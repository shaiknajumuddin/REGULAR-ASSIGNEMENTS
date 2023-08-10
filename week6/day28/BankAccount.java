/*Assignment 3: Method Overloading and Overriding Combined

Create a class BankAccount with methods deposit and withdraw. Implement method overloading to handle different variations of deposit and withdraw methods:

deposit(amount): Deposits the given amount.
deposit(amount, description): Deposits the given amount with a provided description.
withdraw(amount): Withdraws the given amount.
withdraw(amount, description): Withdraws the given amount with a provided description.*/
class BankAccount
  {
    void deposite(int amount)
    {
      System.out.println("deposites the given amount"+amount);
    }
    void deposite(int amount,String description)
    {
      System.out.println("the amount deposited" +amount+ ""+description);
    }
    void withdraw(int amount)
    {
      System.out.println("withdraws the given amount");
    }
    void withdraw(int amount,String description)
    {
      System.out.println("the Withdraw amount is "+amount+""+description);
    }
  }
class Bank
  {
    public static void main(String args[])
    {
      BankAccount b=new BankAccount();
      b.deposite(10000);
      b.deposite(13000,"successful");
      b.withdraw(40000);
      b.withdraw(5000,"successful");
    }
  }