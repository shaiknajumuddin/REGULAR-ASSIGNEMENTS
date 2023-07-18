//Create a class called "Product" with instance variables for storing the product name, price, and quantity. Implement a constructor that takes arguments for each variable and initializes the object.
class Product
  {
    String name;
    int price;
    int quantity;
    Product(String n,int p,int q)
    {
      name=n;
      price=p;
      quantity=q;
      
    }
    public void initializeProduct()
    {
      System.out.println("product name is "+name);
      System.out.println("product price is"+price);
      System.out.println("product quantity is"+quantity);
    }
    public static void main(String args[])
    {
      Product p=new Product("LG",2000,40);
      Product p1=new Product("SAMSUNG",4000,60);
      Product p2=new Product("HP",3000,50);
      p.initializeProduct();
      p1.initializeProduct();
      p2.initializeProduct();
      
      
    }
  }