/*book id,
book title
author name
publishing year
price*/
import java.util.ArrayList;
class Book
  {
    int id;
    String title;
    String authorName;
    int year;
    Book(int id,String title,String authorName,int year)
    {
      this.id=id;
      this.title=title;
      this.authorName=authorName;
      this.year=year;
    }
}
class Books
  {
    public  static void main(String args[])
    {
      ArrayList<Book> bk=new ArrayList<Book>();
      Book b1=new Book(1,"ABC","nazeer",2001);
      Book b2=new Book(2,"DEF","kiran",2000);
      Book b3=new Book(3,"GHI","Sameer",2003);
        bk.add(b1);
      bk.add(b2);
      bk.add(b3);
      for(Book book:bk)
        {
          System.out.println(book.id+" "+book.title+" "+book.authorName+" "+book.year);
        }
    }
  }