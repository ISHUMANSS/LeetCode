class Solution {
    public int largestAltitude(int[] gain) {
        int currHeight = 0;
        int maxHeight = 0;
        for(int g : gain){
            currHeight += g;
            maxHeight = Math.max(maxHeight, currHeight);
        }

        return maxHeight;
        
    }
}