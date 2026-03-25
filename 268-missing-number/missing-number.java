class Solution {
    public int missingNumber(int[] nums) {

        //sort then check
        Arrays.sort(nums);
        int number = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != number){
                number = i;
                return number;
            }
            number = i + 1;
        }

        return number;

        
    }
}