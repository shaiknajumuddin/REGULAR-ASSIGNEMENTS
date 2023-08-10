//Online Shopping System: In an online shopping system, there may be a superclass called Product with a method called calculateDiscount() that calculates the discount on the product's price. Different types of products, such as Electronics and Apparel, may be subclasses of Product and override the calculateDiscount() method to calculate the discount based on their specific sales and promotions. For example, an Electronics product may offer a discount based on the purchase amount or bundle deals, while an Apparel product may offer a discount based on the seasonal trends or inventory clearance.
class Product 
  {
    int totalcost;
    int discount;
    int price=totalcost*discount/100-totalcost;
    void calculateDiscount()
    {
      System.out.println("calculating discount with ");
    }
  }
class Electronics extends Product
  {
    void calculateDiscount()
    {
      
    discount=20;
     totalcost=400;
      int price=totalcost*discount/100-totalcost;
      
       System.out.println("the price of product is "+price);
  }
  }
class Apparal extends Product
  {
    void calculateDiscount()
    {
      
    discount=24;
     totalcost=600;
      int price=totalcost*discount/100-totalcost;
      
       System.out.println("the price of product is "+price);
  }
  
    void display()
    {
      super.calculateDiscount();
      calculateDiscount();
      calculateDiscount();
    }
  }
class Price
  {
    public static void main(String args[])
    {
      Product p=new Product();
      p.calculateDiscount();
      Product c=new Electronics();
      c.calculateDiscount();
      Product a=new Apparal();
      a.calculateDiscount();
    
      
    }
  }
    
    
  