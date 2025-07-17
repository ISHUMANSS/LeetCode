/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var maximumLength = function(nums, k) {
    /*
    //code from 3201
    //we are checking if it is all odd or all even, or alternating either way
    //set up base veriables to count
    let even = 0, odd = 0, evenodd = 0 , oddeven = 0;

    //loop through all the numbers in the array
    for (let num of nums) {
        //if it is even
        if (num % 2 === 0) {
            even++;
            evenodd = oddeven + 1;
        } 
        //if it is odd
        else {
            odd++;
            oddeven = evenodd + 1;
        }
    }

    //return the maximum length of the valid subsequences
    return Math.max(even, odd, evenodd, oddeven);
    */

    //this is similar to the problem 3201 that i did yesterday for the daily challenge
    //but the change is you are given a k value
    //the diffrence is rather then mod 2 it will be mod k

    //O(nk)

    let maxLen = 0;
    for (let val = 0; val < k; val++) {
        let dp = new Array(k).fill(0);
        for (let num of nums) {
            let rem = num % k;
            let need = (val - rem + k) % k;
            let newLen = dp[need] + 1;
            dp[rem] = Math.max(dp[rem], newLen);
            maxLen = Math.max(maxLen, dp[rem]);
        }
    }
    return maxLen >= 2 ? maxLen : 0;

};