class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        //keep track of a sum through the loop and keep track of the highest sum
        // int sum = 0;
        // int bestsum =0;

        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] > sum + nums[i]){
        //         //set set the sub array
        //         sum = nums[i];
        //     }
        //     else{
        //         sum = sum + nums[i];
        //     }
            
        //     if(sum % k == 0){
        //         bestsum = sum;
        //     }
        // }

        // return bestsum;
        
        int n = nums.length;

        // dp[r] = minimum prefix sum seen so far where (prefix_length % k == r)
        long[] dp = new long[k];
        Arrays.fill(dp, Long.MAX_VALUE);

        long sum = 0L; // running prefix sum
        long ans = Long.MIN_VALUE;

        // Base case: A prefix of length 0 has a sum of 0.
        dp[0] = 0L; 

        for (int i = 0; i < n; i++) {
            sum += nums[i]; 
            
            // Calculate remainder based on LENGTH (i + 1)
            int rem = (i + 1) % k; 

            // If we have seen this remainder before, it means we can form 
            // a subarray with length divisible by k ending at i.
            if (dp[rem] != Long.MAX_VALUE) {
                ans = Math.max(ans, sum - dp[rem]);
            }

            // Update the minimum prefix sum for this specific remainder
            dp[rem] = Math.min(dp[rem], sum);
        }

        return ans;

    }
}