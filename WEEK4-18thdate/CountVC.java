import java.util.*;
class CountVC
  {
    public static void main(String args[])
    {
      int vowel=0;
      int consonant=0;
      String s1="andhraloyolacollege";
      for(int i=0;i<s1.length();i++)
        {
          char ch=s1.charAt(i);
          if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
          {
            vowel++;
          }
          else
          {
            consonant++;
          }
       }
      System.out.println("number of vowels are"+vowel);
      System.out.println("number of consonants are"+consonant);
    }
  }