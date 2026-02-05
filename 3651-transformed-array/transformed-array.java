class Solution {
    public int[] constructTransformedArray(int[] nums) {
        //circular array
        //create a new array with thte same size

        int n = nums.length;
        int res[] = new int[n];
        for (int i = 0; i < n; ++i) {
            res[i] = nums[(i + nums[i] % n + n) % n];
        }
        return res;


        
    }
}