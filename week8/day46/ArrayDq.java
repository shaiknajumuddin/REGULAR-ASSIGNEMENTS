[3:20 PM] T.NagaJyothi (Guest)

import java.util.*;

class ArrayDequeEx

  {

    public static void main(String[] args)

    {

      ArrayDeque<Integer> numbers=new ArrayDeque<Integer>();

      numbers.add(110);

      numbers.add(109);

      numbers.add(111);

      numbers.add(112);

     System.out.println("elements of queue array :");

      System.out.println(numbers);

      System.out.println("peek() :"+numbers.peek());

      System.out.println("poll() :"+numbers.poll());

      System.out.println("peekFirst() :"+numbers.peekFirst());

      System.out.println("peekLast() :"+numbers.peekLast());

      System.out.println("offerFirst() :"+numbers.offerFirst(113));

      System.out.println("offerlast() :"+numbers.offerLast(114));

      Iterator itr=numbers.iterator();

      while(itr.hasNext())

        {

          System.out.println(itr.next());

        }

      numbers.remove();

      System.out.println(numbers);

    }

  }