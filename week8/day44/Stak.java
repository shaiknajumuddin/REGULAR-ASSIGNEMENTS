

import java.util.*;

class Stak

  {

    public static void main(String args[])

    {

      Scanner sc=new Scanner(System.in);

      Stack<String> s=new Stack<String>();

      System.out.println("enter the size of the stack");

      int n=sc.nextInt();

      System.out.println("enter stack elements");

      for(int i=0;i<n;i++)

        {

          String value=sc.next();

          s.push(value);

        }

      System.out.println("the elements in the stack are");

      for(String st:s)

        {

          System.out.println(st);

        }

      s.push("grapes");

      s.pop();

      s.set(1,"apple");

      System.out.println("the fruit banana is present in stack "+s.contains("banana"));

      System.out.println(s);

      Collections.sort(s);

      Iterator i=s.iterator();

      while(i.hasNext())

        {

          System.out.println(i.next());

        }

    }

  }
/*
[4:42 PM] S Pushpa latha (Guest)

import java.util.*;

class StackOperations

  {

    public static void main(String args[])

    {

      Scanner sc=new Scanner(System.in);

      System.out.println("enter the number of elements");

      int length=sc.nextInt();

      Stack<Integer> arr=new Stack<Integer>();

      System.out.println("enter the elements into the stack");

      for(int i=0;i<length;i++)

        {

          int value=sc.nextInt();

          arr.push(value);

        }

      System.out.println("Elements are");

      for(Integer obj:arr)

        {

          System.out.println(obj);

        }

      arr.pop();

      System.out.println(arr);

      arr.set(1,100);

      System.out.println(arr);

      Collections.sort(arr);

      Iterator itr=arr.iterator();

      while(itr.hasNext())

        {

          System.out.println(itr.next());

        }

    }

  }

[4:47 PM] S Pushpa latha (Guest)

import java.util.*;

class LinkedList1

  {

    public static void main(String args[])

    {

      Scanner sc=new Scanner(System.in);

      System.out.println("enter number of elements ");

      int length=sc.nextInt();

      LinkedList arr=new LinkedList();

      System.out.println("enter the values");

      for(int i=0;i<length;i++)

        {

          String value=sc.next();

          arr.add(value);

        }

      arr.remove(1);

      System.out.println(arr);

      arr.set(1,"Vijayawada");

      System.out.println(arr);

      Collections.sort(arr);

      for(int i=0;i<arr.size();i++)

        {

          System.out.println(arr.get(i));

        }

      System.out.println("The value Vijayawada in the list:"+arr.contains("Vijayawada"));

      Iterator obj=arr.iterator();

      while(obj.hasNext())

        {

          System.out.println(obj.next());

        }


    }

  }

[4:48 PM] Tulasi ram (Guest)

import java.util.*;

class Stack1

  {

    public static void main(String args[])

    {

      Scanner sc=new Scanner(System.in);

      Stack<Integer> s=new Stack<Integer>();

      System.out.println("Enter the size of the Stack");

      int size=sc.nextInt();

      System.out.println("Enter the Values");

      for(int i=0;i<size;i++)

        {

          int num=sc.nextInt();

          s.push(num);

        }

       System.out.println("Values are");

      for(Integer obj:s)

        {

          System.out.println(obj);

        }

      System.out.println("Elements are");

      s.pop();

      System.out.println(s);

      s.set(1,100);

      System.out.println(s);

      Collections.sort(s);

      Iterator itr=s.iterator();

      while(itr.hasNext())

        {

          System.out.println(itr.next());

        }

    }

  }

[4:49 PM] Shaik Sardar mohiddin (Guest)

import java.util.*;

class Stackex

  {

    public static void main(String args[])

    {

      Scanner sc=new Scanner(System.in);

      Stack<Integer> st=new Stack<Integer>();

      System.out.println("enter the length of a stack");

      int len=sc.nextInt();

      System.out.println("enter the stack elements");

      for(int i=0;i<len;i++)

        {

         int value=sc.nextInt();

          st.push(value);

        }

      st.pop();

      st.pop();

      Collections.sort(st);

      for(Integer it:st)

        {

          System.out.println(it);

        }

    }

  }


//[5:00 PM] Sowjanya Uppu

import java.util.*;

import java.util.Scanner;

public class Main

{

    public static void main(String[] args) {

//    List<String> list=new ArrayList<String>();

    ArrayList list=new ArrayList();

    list.add("apple");

    list.add("mango");

    list.add("grapes");

    LinkedList ll=new LinkedList(list);

    System.out.println(ll);


    }

}*/
