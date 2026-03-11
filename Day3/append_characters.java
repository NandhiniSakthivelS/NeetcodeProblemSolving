class Solution {
    public int appendCharacters(String s, String t) {
       int m=0,n=0;
       while(m<=s.length()-1 && n<=t.length()-1)
       {
          if(s.charAt(m)==t.charAt(n))
          {
            n++;
          }
          m++;
       }
       return t.length()-n;
    }
}