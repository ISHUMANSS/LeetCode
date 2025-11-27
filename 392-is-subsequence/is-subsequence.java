class Solution {
    public boolean isSubsequence(String s, String t) {
        //keep track of a pointer to both of the arrays
        //increase both of them when the answer is seen 
        //increase t when it doesn't match

        int spoint = 0;
        int tpoint = 0;

        while(spoint < s.length() && tpoint < t.length()){
            if(s.charAt(spoint) == t.charAt(tpoint)){
                spoint ++;
            }
            tpoint ++;
        }


        return spoint == s.length();


    }
}