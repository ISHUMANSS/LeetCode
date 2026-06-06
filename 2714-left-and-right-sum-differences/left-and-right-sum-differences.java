class Solution {
    public int[] leftRightDifference(int[] nums) {
        int right = 0;
        int left = 0;
        

        for(int num : nums){
            right += num;
        }

        
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            right -= nums[i]; // right sum
            ans[i] = Math.abs(left - right);
            left += nums[i];
        }

        return ans;


        

    }
}