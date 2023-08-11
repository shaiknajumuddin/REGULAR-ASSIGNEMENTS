class Reverse
  {
    public static void main(String args[])
    {
      String s1="andhraloyolacollege";
      int len=s1.length();
      String rev="";
      for(int i=len-1;i>=0;i--)
        {
          rev=rev+s1.charAt(i);
        }
      System.out.println(rev);
    }
  }