/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSum = function(nums) {
    
    //what am i trying to do:
    /*
        -find the longest sub array with only unique numbers to get the highest "score"
        -need to return the max sum from the subarray
        -get the highest schore by deleting any number of elements
        -each element in the sub array must be unique
        -find all the unique non zero elemets
    */

    //ideas:
    //keep a running max count
    //if a number is less then 0 just skip it
    //if the max element is less then 0
    
    //filter out numbers that are zero or negative
    const onlyPostive = nums.filter(num => num > 0);
    //return the highest value if it doesn't have have postives
    if (onlyPostive.length === 0) {
        return Math.max(...nums)
    }

    //get all the unique numbers in the set
    const unique = [...new Set(onlyPostive)];
    return unique.reduce((acc, num) => acc + num, 0);
   


};