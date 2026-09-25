class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int countMax = 0;
        int count = 0;

        for(int i = 0 ; i < nums.length; i++){
            //if its not a one the count gets reset
            if(nums[i] == 0){
                count = 0;
            }
            else{
                count ++;
                //check if our count is the highest
                countMax = Math.max(countMax, count);
            }

        }

        return countMax;
        
    }
}