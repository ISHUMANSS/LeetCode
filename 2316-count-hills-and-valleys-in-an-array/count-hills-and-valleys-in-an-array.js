/**
 * @param {number[]} nums
 * @return {number}
 */
var countHillValley = function(nums) {

    //need to find if somthing is a hill or valley by comparing it to its neighbors

    let count = 0;
    let left = 0;

    for (let i = 1; i < nums.length - 1; i++) {
        //check they aren't on the same level
        if (nums[i] !== nums[i + 1]) {
            //check if it is a hill or vally
            if (nums[i] > nums[left] && nums[i] > nums[i + 1] || nums[i] < nums[left] && nums[i] < nums[i + 1]) {
                count++;
            }
            left = i;
        }
    }
    return count;

    
};