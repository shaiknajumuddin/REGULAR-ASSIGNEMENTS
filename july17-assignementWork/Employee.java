//Create a class called "Employee" with instance variables for storing the employee's name, designation, and salary. Implement a constructor that takes arguments for each variable and initializes the object.
class Employee
  {
    String name;
    String designation;
    int salary;
    Employee(String n,String d,int s)
    {
      name=n;
      designation=d;
      salary=s;
      
    }
    public void initializeEmployee()
    {
      System.out.println("the employee name is"+name);
      System.out.println("the employee designation is"+designation);
      System.out.println("the employee salary is"+salary);
    }
    public static void main(String args[])
    {
      Employee e=new Employee("nazeer","manager",70000);
       Employee e1=new Employee("nazim","clerk",60000);
       Employee e2=new Employee("sameen","client",40000);
      e.initializeEmployee();
       e1.initializeEmployee();
       e2.initializeEmployee();
      
    }
  }
