/**
 * @param {number[]} nums
 * @return {number}
 */
var maximumLength = function(nums) {
    //think of it as a graph problem 
    /* pusdo code form lectures
        this is to find the max increasing sub sequence rather then the valid subsequence so we need to change the valid part
        so it matches (sub[0] + sub[1]) % 2 == (sub[1] + sub[2]) % 2 == ... == (sub[x - 2] + sub[x - 1]) % 2
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

    //O(n)
    
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
    

};