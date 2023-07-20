//Create a class called "Book" with instance variables for storing the book title, author, and publication year. Implement a method named initializeBook that takes arguments for each variable and initializes the object. Display the details of the book using a separate method.
class Book
  {
    String title;
    String author;
    int year;
    public void initializeBook(String t,String a,int y)
    {
      title=t;
      author=a;
      year=y;
    }
    public void display()
    {
      System.out.println("the book title is"+title);
      System.out.println("the author name is "+author);
      System.out.println("the year of book is "+year);
    }
    public static void main(String args[])
    {
      Book b=new Book();
      Book b1=new Book();
      Book b2=new Book();
      b.initializeBook("java","james",2001);
      b1.initializeBook("python","nazeer",2002);
      b2.initializeBook("c++","james",2003);
      b.display();
      b1.display();
      b2.display();
     
    }
  }