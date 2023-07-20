class Nested
{
  public static void main(String args[])
  {
    int n=20;
    if(n%2!=0)
    {
      System.out.println("even");
      if(n%3!=0)
      {
        System.out.println("true");
      }
      else
      {
        System.out.println("false");
      }
    }
    else
    {
      System.out.println("odd");
      if(n%4==0)
      {
        System.out.println("even");
        if(n%3!=0)
        {
          System.out.println("true");
        }
        else
        {
          System.out.println("false");
        }
     }
  }
  }
}