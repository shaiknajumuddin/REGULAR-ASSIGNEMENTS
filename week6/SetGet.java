class Student
{
 private String name;
  private int rollno;
   public void setName(String name)
  {
   this.name=name;
  }
 public String getName()
 {
  return name;
 }
 public void setRollno(int rollno)
 {
   this.rollno=rollno;
 }
public int getRollno()
{
 return rollno;
}
 }
class DataEncap
{
 public static void main(String args[])
 {
    Student student=new Student();
    student.setName("sowjanya");
    student.setRollno(123);
    System.out.println(student.getName());
    System.out.println(student.getRollno());

    }

  }