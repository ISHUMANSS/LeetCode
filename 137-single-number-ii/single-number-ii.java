class Solution {
    public int singleNumber(int[] nums) {
        //not in the time it wants but who cares

        //now all the numbers will be in order so they are easier to check
        Arrays.sort(nums);

        //go up three times causue thats how many  it needs to be
        for(int i = 0; i < nums.length - 1; i += 3){
            if(nums[i] != nums[i+1]){
                //current number is the odd one out
                return nums[i];
            }
        }

        //its the final number that we didn't check
        return nums[nums.length - 1];
    }
}