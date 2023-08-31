import java.util.HashMap;
import java.util.Map;

class Maps
  {
    public static void main(String args[])
    {
      HashMap<String ,String> map=new HashMap<String ,String>();
      map.put("c","c is a procedural programming language");
      map.put("java","java is object oreinted programming");
      map.put("html","hyper text markup langue");
      map.put("c","c is a procedural programming language");
      System.out.println(map);
      for(MapEntry<String,String> entry:map.entrySet())
        {
          System.out.println(entry.getKey());
          System.out.println(entry.getValue());
        }
      map.remove("html");
      System.out.println(map);
    }
  }
