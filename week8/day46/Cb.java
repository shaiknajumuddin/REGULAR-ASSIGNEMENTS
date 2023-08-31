import java.util.PriorityQueue;
import java.util.Iterator;
public class Main
{
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("priya");
        queue.add("gowri");
        queue.add("jayasri");
        queue.add("suhana");
        queue.add("prashanthi");
        Iterator itr=queue.iterator();
        System.out.println("iterating the elements");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        queue.offer("sardar");
        System.out.println(queue);
        System.out.println("head element using element() "+queue.element());
        System.out.println("head element using peek()"+queue.peek());
        PriorityQueue<String> queue1=new PriorityQueue<String>();
    //    System.out.println("head element using element() "+queue1.element());
        System.out.println("head element using peek()"+queue1.peek());

    }
}


