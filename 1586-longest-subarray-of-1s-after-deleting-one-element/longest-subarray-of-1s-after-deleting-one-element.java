class Solution {
    public int longestSubarray(int[] nums) {

        //find longest amout of 1s

        //MUST DELETE ONE ELEMENT

        //return the longest non empty subarray

        //use sliding window to be able to keep and find the longest subarray 

        //it updates as it goes along keeping the scopes 
        //it checks to see if the length between the pointers of the windows are in higher then the max length to be able to see which is bigger the current window or the max length

        int left = 0;
        int max_length = 0;
        int last_zero = -1;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                left = last_zero + 1;
                last_zero = right;
            }

            max_length = Math.max(max_length, right - left);
        }

        return max_length;
    }
}