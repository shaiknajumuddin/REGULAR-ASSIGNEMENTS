import java.util.HashSet;

class HashSetExample1 {

  public static void main(String args[])

  {

    HashSet<String> arr = new HashSet<String>();

    arr.add("pushpa");

    arr.add("latha");

    arr.add("pushpa");

    arr.add("karuna");

    arr.add(null);

    arr.add(null);

    System.out.println(arr);

    // [null, latha, pushpa, karuna]

    arr.remove(2);

    System.out.println(arr);

    // [null, latha, pushpa, karuna]

    arr.remove("karuna");

    System.out.println(arr);

    // [null, latha, pushpa]

    // doesn't allow the duplicate values

    // doesn't allow more than on null value

    // we can not perform any operation by using index positions because it is the
    // collection of unordered data.

  }

}