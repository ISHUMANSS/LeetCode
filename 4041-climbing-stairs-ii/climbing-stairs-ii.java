class Solution {
    public int climbStairs(int n, int[] costs) {
        //use recursion
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return recur(0,n,costs,dp);
        
    }

    private int recur(int i, int n, int[] costs, int[] dp){
        //break case when it wants to jump higher then the furthist step
        if(i > n){
            return Integer.MAX_VALUE;
        }

        //reached the top
        if(i == n){
            return  0;
        }

        if (dp[i] != -1){
            return dp[i];
        }

        //jump one step
        int oneStep = (costs[i] + 1) + recur(i + 1, n, costs, dp);
        //jump two steps
        int twoStep = i + 2 <= n ? (costs[i + 1] + 4) + recur(i + 2, n, costs, dp) : Integer.MAX_VALUE;
        //jump 3 steps
        int threeStep = i + 3 <= n ? (costs[i + 2] + 9) + recur(i + 3, n, costs, dp) : Integer.MAX_VALUE;

        //move to the next step
        return dp[i] = Math.min(oneStep, Math.min(twoStep, threeStep));
    }
}