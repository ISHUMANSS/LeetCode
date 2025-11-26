class Solution {
    public boolean isSubsequence(String s, String t) {
        //find if there is a subsequence of t inside the 
        //if the characters show up in order then it is true

        //need to keep track of the characters we have seen if they match the wanted subsequence

        //if our points for the two string match each other then we can move both of them to the next position
        //when we get to the end of s we can stop

        if (s.length() == 0) return true;
        if (s.equals(t)) return true;

        int s_pointer = 0;
        int t_pointer = 0;

        //loop through if the pointers are still in range
        while(s_pointer < s.length() && t_pointer < t.length()){
            if(s.charAt(s_pointer) == t.charAt(t_pointer)){
                s_pointer ++;
            }
            t_pointer ++;
        }
        return s_pointer == s.length();
    }
}