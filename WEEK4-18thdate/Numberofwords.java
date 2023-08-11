class Numberofwords
  {
    public static void main(String args[])
    {
      String s1="welcome to andhra loyola college";
      String split[]=s1.split("");
      int count=0;
      for(int i=0;i<s1.length();i++)
        {
          count++;
        }
      System.out.println("the number of words are"+count);
    }
  }