class Solution {
    public int minChanges(String s) {
        int changes = 0;

        for(int i = 0; i < s.length(); i +=2){
            if(s.charAt(i) != s.charAt(i + 1)){
                changes ++;
            }
        }

        return changes;



        //orginal test solution that didn't work

        // //get counts of 1s and zeros
        // //from that we can see which way would be easier
        // int ones = 0;
        // int zeros = 0;

        // for(char c : s.toCharArray()){
        //     if(c == '1'){
        //         ones ++;
        //     }
        //     else if(c == '0'){
        //         zeros ++;
        //     }
        // }

        // //retuen the number which is lower as number of changes
        // if(ones >= zeros){
        //     return zeros;
        // }
        // else if(ones <= zeros){
        //     return ones;
        // }

        // return 0;

        
    }
}
