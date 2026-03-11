class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=0,m=0;
        
        while(n<=s.length()-1 && m<=t.length()-1)
        {
            if(t.charAt(m)==s.charAt(n))
            {
                n++;
            }
            m++;
        }
        return n==s.length();
    }
}