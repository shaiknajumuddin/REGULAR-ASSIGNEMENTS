class AlphaDigitSymbol
  {
    public static void main(String args[])
    {
      int alphabet=0,digit=0,symbol=0;
      String s1="andhra loyola college@**123";
      for(int i=0;i<s1.length();i++)
        {
          char ch=s1.charAt(i);
          if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='z'))
          {
            alphabet++;
          }
          else if(ch>='0'&&ch<='9')
          {
            digit++;
          }
         else
          {
            symbol++;
          }
        }
      System.out.println("the no of alphabets in the given string ="+alphabet);
       System.out.println("the no of digits in the given string ="+digit);
       System.out.println("the no of symbols in the given string ="+symbol);
    }
  }
                                 