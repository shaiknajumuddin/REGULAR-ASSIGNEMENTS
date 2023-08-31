/*Scenario: Managing a Store's Products
As a store manager, you are responsible for managing all the operations related to the products in your store. You have a system that stores all the product details (product_id, name, category, price) in an ArrayList of Product objects.
Your task is to create a Java program that helps you manage the store efficiently.
Create a console-based menu-driven program that allows the user to perform the following operations:
1.Add products.
2.Calculate the total price of all products.
3.Remove a product by product_id.
4.Update the price of a product by product_id.
5.Search products by category.
6.Quit the program.
If no products are found for the given category, the program should provide an appropriate message indicating that no products were found.*/


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
class Product
  {
    int pid;
    String pname;
    String pcategory;
    double price;
    Product(int pid,String pname,String pcategory,double price)
    {
      this.pid=pid;
      this.pname=pname;
      this.pcategory=pcategory;
      this.price=price;
    }
  }
class Main
  {
    ArrayList<Product> product=new ArrayList<Product>();
     Scanner sc=new Scanner(System.in);
   public void addProduct()
    {
      System.out.println("enter id of the product");
      int id=sc.nextInt();
      System.out.println("enter the name of the product");
      String name=sc.next();
      System.out.println("enter the category of the product");
      String category=sc.next();
      System.out.println("enter the price of the product");
      double price=sc.nextDouble();
      Product product1=new Product(id,name,category,price);
      product.add(product1);
      System.out.println("Product is added");
    }
    public void calculatePrice()
    {
      double totalPrice=0.0;
      for(Product value:product)
        {
          totalPrice=totalPrice+value.price;
        }
      System.out.println("Total price of the products is "+totalPrice);
    }
    public void removeProduct()
    {
      System.out.println("enter the product id which we have to remove");
        int id=sc.nextInt();
     Iterator<Product> iterator = product.iterator();
    while (iterator.hasNext()) {
        Product value = iterator.next();
        if (value.pid == id) {
            iterator.remove();
            break;
        }
    }
      System.out.println("Product is removed");
    }
    public void updatePrice()
    {
      System.out.println("enter the product id for which we have to update the price");
              int id=sc.nextInt();
              System.out.println("enter the price to be updated");
              double newPrice=sc.nextDouble();
      for(Product value:product)
        {
          if(value.pid==id)
          {
            value.price=newPrice;
          }
        }
    }
    public void searchProduct()
    {
      System.out.println("Enter the category type for displaying those category products");
        String category=sc.next();
      for(Product value:product)
        {
          String data=value.pcategory;
          if(data.equals(category))
          {
            System.out.println("Product Name: " + value.pname);
            System.out.println("Product Category: " + value.pcategory);
            System.out.println("Product Price: " + value.price);
          }
        }
    }
    public void displayProduct()
    {
        System.out.println("the products are in this list is");
        for(Product prd:product)
        {
            System.out.println(prd.pid+" "+prd.pname+" "+prd.pcategory+" "+prd.price);
        }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Main pm=new Main();
      do{
        System.out.println("1.Adding the product \n 2.Calculating total price \n 3.Removing the product by using product id \n 4.Update the price of a product by using product id \n 5.Searching the product by using category \n 6.display allproducts \n 7.exit");
        System.out.println("enter your choice");
        int choice=sc.nextInt();
        switch(choice)
          {
            case 1:
              System.out.println("enter the product details");
              pm.addProduct();
              break;
            case 2:
              pm.calculatePrice();
              break;
            case 3:
              pm.removeProduct();
              break;
            case 4:

              pm.updatePrice();
              break;
            case 5:
              pm.searchProduct();
              break;
            case 6:
                pm.displayProduct();
                break;
            case 7:
              System.exit(0);
          }
      }while(true);
    }
}