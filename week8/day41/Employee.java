class Employee123
  {
    private String name;
    private int id;
    private int age;
    private double salary;
    private String designation;
    void setName(String name)
    {
      this.name=name;
    }
    void String getName()
    {
      return this.name;
    }
    void int setID(int id)
    {
      this.id=id;
    }
    void getId()
    {
      return this.id;
    }
    void int setAge(int age)
    {
      this.age=age;
    }
    void getAge()
    {
      return this.age;
    }
    void double setSal(double salary)
    {
      this.salary=salary;
    }
    void getSal()
    {
      return this.salary;
    }
    void String setDes(String designation)
    {
      this.designation=designation;
    }
    void getDes()
    {
      return this.designation;
    }
    
  }
class Employee
  {
    public static void main(String args[])
    {
      Employee123 emp=new Employee123();
      emp.setname("kiranmai");
      emp.setID(1);
      emp.setSal(2000.0);
      emp.setDes("client");
      emp.setAge(23);
      System.out.println(emp.getname());
      System.out.println(emp.getId());
      System.out.println(emp.getSal());
      System.out.println(emp.getnDes());
      System.out.println(emp.getAge());
    }
  }