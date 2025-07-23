/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function(nums, target) {
    
    //use binary search
    let low = 0;
    let high = nums.length;

    while(low < high){
        //calculate each middle point
        let mid = low + Math.floor((high-low)/2);
        if(target > nums[mid]){
            low = mid + 1;
        }
        else{
            high = mid;
        }
    }

    return low;


};