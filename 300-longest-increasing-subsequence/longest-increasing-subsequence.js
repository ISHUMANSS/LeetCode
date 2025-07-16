/**
 * @param {number[]} nums
 * @return {number}
 */
var lengthOfLIS = function(nums) {
    //think of it as a graph problem 
    /* pusdo code form lectures
        INPUT: An integer array a of length n
        OUTPUT: The length of the longest increasing subsequence in a
        Create an integer array L[1..n]
        Set every L[i] to 1
        for i = 2..n do
         for j = 1..i  1 do
            if a[ j] < a[i] then
                L[i] max{L[i], a[j] + 1}
        Return max{L[i] | 1  i  n}
    */

    //O(n^2)

    //base case when it is empty
    if (!nums || nums.length === 0) {
        return 0;
    }

    //get the lenght so we can reuse it better
    let l = nums.length;
    //create a new array
    const dp = new Array(l).fill(1);

    for(let i = 0; i < l; i++){
        for(let j = 0; j < i ; j++){
            if (nums[i] > nums[j]) {
                //get the subsequence
                dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        } 
    }

    //return the max value
    return Math.max(...dp);
    
};