class Solution {
    public int numSub(String s) {
        long count = 0, res = 0;
        for(char c : s.toCharArray()){
            if(c == '1'){
                count++;
            }
            else {
                res += (count*(count+1))/2;
                count = 0;
            }
        }
        res = res % 1_000_000_007;
        return (count == 0) ? (int)res : (int)(res += (count*(count+1))/2); 
    }
}