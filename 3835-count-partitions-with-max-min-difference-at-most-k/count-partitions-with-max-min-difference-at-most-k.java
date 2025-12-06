class Solution {
    private static final int MOD = 1_000_000_007;

    public int countPartitions(int[] nums, int k) {
        int n = nums.length;
        long[] dp = new long[n + 1];
        long[] pref = new long[n + 1];

        dp[0] = 1;
        pref[0] = 1;

        Deque<Integer> minq = new ArrayDeque<>();
        Deque<Integer> maxq = new ArrayDeque<>();
        int l = 0;

        for (int r = 0; r < n; r++) {
            int x = nums[r];

            //(increasing)
            while (!minq.isEmpty() && nums[minq.peekLast()] >= x) {
                minq.pollLast();
            }
            minq.offerLast(r);

            //                  (decreasing)
            while (!maxq.isEmpty() && nums[maxq.peekLast()] <= x) {
                maxq.pollLast();
            }
            maxq.offerLast(r);

            // Shrink from left until valid;
            while (!minq.isEmpty() && !maxq.isEmpty()
                   && nums[maxq.peekFirst()] - nums[minq.peekFirst()] > k) {
                if (minq.peekFirst() == l) minq.pollFirst();
                if (maxq.peekFirst() == l) maxq.pollFirst();
                l++;
            }

            long base = (l > 0) ? pref[l - 1] : 0;
            long val = (pref[r] - base) % MOD;
            if (val < 0) val += MOD;

            dp[r + 1] = val;
            pref[r + 1] = (pref[r] + dp[r + 1]) % MOD;
        }

        return (int)(dp[n] % MOD);
    }
}