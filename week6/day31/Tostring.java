//toString:- converts the propertys object into a single string  and we can access the values by using object name in println function.
class Employee
  {
    int id;
    double salary;
    String empname;
    String designation;
    public String toString()
    {
        return 1+" "+salary+" "+empname+""+designation;
    }
    public static void main(String[] args) {
            Student student=new Student();
            student.rollno=123;
            student.name="sowjanya";
            student.address="vij";
            System.out.println(student);

    }
}