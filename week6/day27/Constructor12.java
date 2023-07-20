// when you want to call one constructor in another constructor in the current class
class Employee
  {
   String name;
    int empid;
    String designation;
    float salary;
    Employee(String name,int empid,String designation)
    {
      this.name=name;
      this.empid=empid;
      this.designation=designation;
    }
    Employee(String name,int empid,String designation,float salary)
    {
      this(name,empid,designation);
      this.salary=salary;
    }
    void display()
    {
      System.out.println(name+" "+empid+" "+designation+" "+salary);
    }
    public static void main(String args[])
    {
      Employee emp=new Employee("John",123,"manager",12000.0f);
      Employee emp1=new Employee("John",123,"manager");
      emp.display();
      emp1.display();
    }
  }