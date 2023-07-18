

//Create a class called "Person" with instance variables for storing the person's name, age, and address. Implement a constructor that takes arguments for each variable and initializes the object.
class Person
  {
    String name;
    int age;
    String address;
    Person(String n,int a,String b)
    {
      name=n;
      age=a;
      address=b;
    }
    public void display()
    {
      System.out.println(name+""+age+""+address);
    }
    public static void main(String args[])
    {
      Person p=new Person("nazeer",25,"temple road");
      p.display();
    }
  }