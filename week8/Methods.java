import java.util.TreeSet;
public class Methods
{
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<Integer>();
        ts.add(45);
        ts.add(23);
        ts.add(78);
        ts.add(16);
        ts.add(30);
        ts.add(78);
    //    ts.add(null);
        for(Integer data:ts)
        {
            System.out.println(data);
        }
        //System.out.println(ts.descendingSet());
    //    System.out.println(ts.pollFirst());
    //    System.out.println(ts);
    //    System.out.println(ts.pollLast());
    //    System.out.println(ts);    
    //System.out.println("head set"+ts.headSet(30));
    System.out.println("Tail set"+ts.tailSet(30,false));
    System.out.println("tail set"+ts.tailSet(30,true));
    System.out.println("Sub Set"+ts.subSet(23,true,78,false));
    }
}
