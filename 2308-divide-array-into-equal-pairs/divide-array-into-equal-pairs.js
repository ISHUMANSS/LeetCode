/**
 * @param {number[]} nums
 * @return {boolean}
 */
var divideArray = function(nums) {
    //sort all the numbers to make pair checking easier
    let sorted = nums.sort();

    //check each pair in the new sorted list
    //if they are sorted correctly they will all be next to each other so you can just check the current with the one next to it
    for(let i = 0; i < sorted.length; i += 2){//after cheking a pair go and check the next pair
        if(sorted[i] !== sorted[i + 1]){
            return false;
        }
    }

    //it has checked all the
    return true;

    
};