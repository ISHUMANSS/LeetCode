class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        for(int i = 0; i < bits.length; i++){
            //0 moves over by one step cause of the loop
            if(i == bits.length - 1){
                //reached the end
                return true;
            }
            if(bits[i] == 1){
                //skip to the next bit if there is a 1
                i++;
            }
        }
        return false;
    }
}