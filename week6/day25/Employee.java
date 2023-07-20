class Employee
  {
    int id;
    String name;
    String designation;
    
      public void display()
      {
        System.out.println("id of employee"+id);
        System.out.println("name of employee"+name);
        System.out.println("designation of employee"+designation);
      }
      public static void main(String args[])
        {
        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();
        e1.id=123;
        e1.name="nazeer";
        e1.designation="manager";
        e2.id=124;
        e2.name="nazeem";
        e2.designation="client";
        e3.id=125;
        e3.name="najju";
        e3.designation="clerk";
        e1.display();
        e2.display();
        e3.display();
      }
    }