//create a class called "Student" with instance variables for storing the student's name, roll number, and grade. Implement a constructor that takes arguments for each variable and initializes the object.
class Student
  {
    String name;
    int rollnumber;
    char grade;
    Student(String n,int r,char g)
    {
      name=n;
      rollnumber=r;
      grade=g;
    }
      public void initializeStudent()
        {
        System.out.println("the student name is "+name);
        System.out.println("the student roll number is "+rollnumber);
        System.out.println("the student grade is "+grade);
        }
    public static void main(String args[])
    {
      Student s=new Student("nazeer",112,'A');
      Student s1=new Student("nazeem",193,'B');
      Student s2=new Student("sameen",114,'C');
      s.initializeStudent();
      s1.initializeStudent();
      s2.initializeStudent();
      
      
      
    }
  }
  