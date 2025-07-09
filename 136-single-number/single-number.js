/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {


    //needs to be O(n)
    //so needs to go through the list only once pretty much no nested loops
    
    //use XOR

    let checker = 0;
    for(let i = 0; i < nums.length; i++){
        checker ^= nums[i];
    }
    return checker;



    
};