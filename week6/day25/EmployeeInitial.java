//Create a class called "Employee" with instance variables for storing the employee's name, designation, and salary. Implement a method named setEmployeeDetails that takes arguments for each variable and initializes the object. Implement another method named displayEmployeeDetails to display the employee's details.

class EmployeeInitial
  {
    String name;
    String designation;
    int salary;
    public void setEmployeeDetails(String n,String d,int s)
    {
      name=n;
      designation=d;
      salary=s;
    }
    public void displayEmployeedetails()
    {
      System.out.println("employee name is"+name);
      System.out.println("employee designation is "+designation);
      System.out.println("employee salary is "+salary);
    }
    public static void main(String args[])
    {
      EmployeeInitial e=new EmployeeInitial();
      e.setEmployeeDetails("nazeer","manager",2009);
      e1.setEmployeeDetails("nazeer","manager",2009);
      e2.setEmployeeDetails("nazeer","manager",2009);
      e.displayEmployeedetails();
      
    }
  }

