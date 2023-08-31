/*

while removing the elements it doesnot take the indexing it only takes the values

[2:35 PM] Sarikonda HariPriya (Guest)

import java.util.*;

class TreeSetEx

  {

    public static void main(String args[])

    {

      TreeSet<String> t=new TreeSet<String>();

      t.add("mango");

      t.add("goa");

      t.add("banana");

      System.out.println(t);//treeset is fallowing sorting order

      t.remove("goa");//it takes the values for removal

      System.out.println(t);

      t.add("mango");//it is not displaying the duplicate values two times

      t.add("null");

      t.add("null");//it accepts only one null values

      System.out.println(t);

      System.out.println(t.contains("banana"));

      System.out.println(t.size());

    }

  }*/


import java.util.TreeSet;
class TreeSetEx1
  {
    public static void main(String args[])
    {
      TreeSet<Integer> arr=new TreeSet<Integer>();
      arr.add(100);
      arr.add(20);
      arr.add(30);
      arr.add(20);
      //arr.add(null);
      //arr.add(null);
      System.out.println(arr);
      //it does not allow null values and duplicate values
      //the data will be stored in a sorted order
      arr.remove(1);
      System.out.println(arr);
      //we can not perform any operations based on index positions
    }
  }







[2:34 PM] S Pushpa latha (Guest)

import java.util.LinkedHashSet;

class LinkedHashSetEx1

  {

    public static void main(String args[])

    {

      LinkedHashSet<Integer> arr=new LinkedHashSet<Integer>();

      arr.add(10);

      arr.add(90);

      arr.add(10);

      arr.add(100);

      arr.add(null);

      arr.add(null);

      System.out.println(arr);

      //[10, 90, 100, null]

      //it doesnot allow duplicate values and more than one null value

      //it allows the insertion order while storing the data

      arr.remove(90);

      System.out.println(arr);

      Collections.sort(arr);

      //we can not use sort method

      //we can not perform operaions based on index positions

    }

  }


[2:46 PM] mounika

Linked set:

1.They are not allowed to contain duplicates elements

2.It doesn't maintain order for it's objects or elements

3.It allows only one null values

Tree Set:

1.Tree set doesn't allows null elements

2.tree set maintains ascending order

3.tree set class non-synchronized

HashSet:

1.hashset allows null values

2.hashset class non-synchronized

3.hashset doesn't maintain insertion order

[2:46 PM] Tulasi Ram (Guest)

import java.util.HashSet;

class HashSetEx

{

    public static void main (String[] args)

  {

        HashSet<Integer> hlist =new HashSet<Integer>();

        hlist.add(23);

        hlist.add(23); //reneter the Same value

        hlist.add(44);

        hlist.add(55); //Add new Value

       hlist.add(null);

         hlist.add(null);

        System.out.println(hlist); //Print the HashSet

        hlist.remove(55); //Removing Some Value in Hash Set

  System.out.println(hlist); //Printing the set after remove

    }

}

[2:47 PM] Ramya Kota  (Guest)

1.hashset represents a group of unique elements and it does not maintain any order.

hashset uses hash table for its internal storage.

2.Linkedhashset extends hashset class and implements set interface,it maintains insertion order.

3.Treeset uses  tree structure for  internal storage.

[2:47 PM] sravanthi (Guest)

Treeset does not allow any null value

By default the data is stored in ascending order

It does not allow duplicate values


[2:49 PM] gbalavamsi      (Guest)

 

 

[2:49 PM] SuhanaBegum (Guest)

HashSet: 

In Hashset we cannot store the duplicate values or elements and it takes only unique values

doesnt maintain any insertion order

It allows atleast one null value.

We can not predict the insertion order in HashSet

LinkedHashset:

In LinkedHashSet it didn't allows the duplicate values

It maintaining the insertion order.

we can predict the insertion order in LinkedHashSet.

[2:50 PM] Shaik Sardar mohiddin (Guest)

import java.util.*;

class Hashset1

  {

    int roll;

    String name;

    String branch;

    Hashset1(int roll,String name,String branch)

    {

      this.roll=roll;

      this.name=name;

      this.branch=branch;

    }

    public String toString()

    {

      return roll+" "+name+" "+branch;

    }

  }

class Main

  {

    public static void main(String args[])

    {

      Scanner sc=new Scanner(System.in);

      System.out.println("enter the number of students");

      int num=sc.nextInt();

      HashSet<Hashset1> h=new HashSet<Hashset1>();

      for(int i=0;i<num;i++)

        {

          System.out.println("enter student "+(i+1)+"details");

          System.out.println("enter the roll number");

          int roll=sc.nextInt();

          System.out.println("enter the name of a student");

         String name=sc.next();

          System.out.println("enter the branch");

         String branch=sc.next();

          Hashset1 std=new Hashset1(roll,name,branch);

          h.add(std);

        }

      for(Hashset1 sardar:h)

        {

          System.out.println(sardar);

        }

    }

  }

[2:54 PM] D.Gowrikumar(Guest)3`

import java.util.*;

class LinkedListSet

  {

    public static void main(String args[])

    {

    LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>();

    ls.add(99);

    ls.add(15);

    ls.add(18);

      // mentain insertion values;

    ls.add(null); // accepts only one 

    ls.add(18); // do not allow duplicate values

    System.out.println(ls);

      ls.remove(18);//it takes the value for removal

      System.out.println(ls);

      ls.add(156);

      System.out.println(ls);

    }    

  }

[2:57 PM] Chandolu Joseph Venkat Vidhya Roy (Guest)



Set: 

Stores only unique values but not duplicate value

does not follow insertion order

Set<Integer> setOfNumbers = new HashSet<>();

 

  HashSet: This Hashset is the most widely used version of a Set which gives a unique ordered list.

           Set<Integer> setOfNumbers = new HashSet<>();


  LinkedHashSet: The only difference in LinkedHashSet with HashSet is that it orders the elements based on insertion order.

                 Set<String> setOfNames = new LinkedHashSet<>();

 

  TreeSet: In a TreeSet the ordering takes place based on the values of the inserted element. It follows a natural ordering by default.

           Set<Integer>setOfNumbers = new TreeSet<>();