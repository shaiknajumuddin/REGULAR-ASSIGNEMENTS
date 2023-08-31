import java.util.Set;
import java.util.Iterator;
import java.util.HashSet;
public class Main
{
    public static void main(String[] args) {
        Set<String> hs=new HashSet<String>();
        hs.add("apple");
        hs.add("potoato");
        hs.add("pumpkin");
        hs.add("grapes");
        System.out.println("the elements are");
        Iterator<String> itr=hs.iterator();
        while(itr.hasNext())
        {
           System.out.println(itr.next());
        }
        hs.add("apple");
        System.out.println(hs);

    }
}