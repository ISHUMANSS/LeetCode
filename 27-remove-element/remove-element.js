/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function(nums, val) {

    //create a pointer
    let k = 0;


    for(let i = 0; i < nums.length; i ++){
        if(nums[i] !== val){
            //only keep the the values not = to val
            nums[k++] = nums[i];
        }
    }
    
    return k;
    
};