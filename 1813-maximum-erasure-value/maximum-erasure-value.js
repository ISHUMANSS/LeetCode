/**
 * @param {number[]} nums
 * @return {number}
 */
var maximumUniqueSubarray = function(nums) {
    //each subarray needs to contain unique elements 
    //we are trying to get a highest score by removing only one subarray
    //

    //can be solved using 2 pointer with one at the start and one at the end

    //we need to be able to know if the elements are unique

    //if we use somthing like a hashmap or an nmap to check if nmap bucket goes above 1 then we know that the new number isn't unique
    //that would mean we have to increase the left pointer untill the counter become 1 again
    //we also need to keep track of the sum total of the sliding window at each iteration once have the confirmed they are qunite
    //we should update the widnow so it has our best result so far so we can return the best

    //set up varables
    let nmap = new Int8Array(10001), total = 0, best = 0
    for (let left = 0, right = 0; right < nums.length; right++) {
        nmap[nums[right]]++, total += nums[right]
        while (nmap[nums[right]] > 1)
            nmap[nums[left]]--, total -= nums[left++]
        best = Math.max(best, total)
    }
    return best


    
};