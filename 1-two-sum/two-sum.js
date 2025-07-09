/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {

    //get 2 numbers in one array that add up to a target
    //exactly one solution
    //no reusing element

    //return answer in any order

    //two options 2 loops comparing everything
    //brute force nested loop
    //O(n^2)
    /*
    for (let i = 0; i < nums.length - 1; i++){
        for(let j = i + 1; j < nums.length;j++){
            if((nums[i] + nums[j]) == target){ //check the numbers against each other
                //return the indexes in the array where they occur
                //end.push(i);
                //end.push(j);
                return [i,j];
            }
        }
    }  
    return [];
    */

/*
//solid and faster but if we could do it in one pass it would be way faster
    //2 pass hash
    //better complexity useing a hashmap
    //O(n)
    const map = new Map();
    //first loop
    for(let i = 0; i < nums.length; i++){
        map.set(nums[i], i); //add all of the values to the map
    }
    //second loop
    for(let i = 0; i < nums.length; i++){
        let complement = target - nums[i]; //check to see if the target value would equal the current number
        if(map.has(complement) && map.get(complement) !== i){ //see if target is in the map and that it isn't at the current index
            return [i, map.get(complement)];
        }
    }
    return [];
*/

    //one pass hash
    //better complexity useing a hashmap
    //O(n)
    const map = new Map();
    
    for(let i = 0; i < nums.length; i++){
        let current = nums[i];
        let complement = target - current;
        
        if(map.has(complement)){ //see if target is in the map and that it isn't at the current index
            return [map.get(complement), i];
        }

        map.set(nums[i], i); //add all of the values to the map
    }
    return [];

    
};