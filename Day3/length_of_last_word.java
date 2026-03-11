class Solution {
    public int lengthOfLastWord(String s1) {
        String s=s1.trim();
        String arr[]=s.split(" ");
        int temp=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i].isEmpty() || arr[i].isBlank())
            {
                continue;
            }
            return arr[i].length();
        }
        return -1;
    }
}