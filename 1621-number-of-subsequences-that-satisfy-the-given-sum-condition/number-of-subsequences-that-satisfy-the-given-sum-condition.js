/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var numSubseq = function(nums, target) {

    //target is the num

    //we are returning the count of sub sequences after we have found all the ones thay satisfy the given conditions

    //to be allowed it needs to be less or equeal to the target

    //sort the data
    let count = 0;
    nums.sort((a,b) => a - b);

    //quick escape
    if(target < nums[0]) return 0;

    const MOD = 1e9 + 7;

    const pow2 = Array(nums.length).fill(1);
    for (let i = 1; i < nums.length; i++) {
        pow2[i] = (pow2[i - 1] * 2) % MOD;
    }

    //set up binary search to find the max index
    const binarySearch = (A, n) => {
        let L = 0, H = A.length - 1;
        while (L <= H) {
            const M = L + ((H - L) >> 1);
            if (A[M] <= n) L = M + 1;
            else H = M - 1;
        }
        return H;
    };

    //go through to be able to find all the info
    for (let i = 0; i < nums.length; i++) {
        const want = target - nums[i];
        const idx = binarySearch(nums, want);
        if (idx >= i) {
            count = (count + pow2[idx - i]) % MOD;
        }
    }

    return count;

    
};