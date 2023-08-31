
/*book id,
book title
author name
publishing year
price*/

import java.util.*;
class Student
{
    int rollno;
    String name;
    String address;
    long mobile;
    Student(int rollno,String name,String address,long mobile)
    {
        this.rollno=rollno;
        this.name=name;
        this.address=address;
        this.mobile=mobile;
    }
    /*public String toString()
    {
        return rollno+" "+name+" "+address+" "+mobile;
    }*/
}
public class Book2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Student> al=new ArrayList<Student>();
        System.out.println("enter number of students");
        int number=sc.nextInt();
        for(int i=0;i<number;i++)
        {
            System.out.println("enter student "+(i+1)+" details");
            System.out.println("enter roll number");
            int rollno=sc.nextInt();
            sc.nextLine();
            System.out.println("enter name");
            String name=sc.nextLine();
            System.out.println("enter address");
            String address=sc.next();
            System.out.println("enter mobile number");
            long mobile=sc.nextLong();
            Student student=new Student(rollno,name,address,mobile);
            al.add(student);
        }
        System.out.println("the student details are");
        for(Student std:al)
        {
            System.out.println(+std.rollno+" "+std.name+" "std.address+" "+std.mobile );
        }
    }
}




