/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function(nums1, m, nums2, n) {
    //given 2 arrays that we need to merge
    //both arrays are sorted and they need to be combined


    for (let i = m, j = 0; j < n; i++, j++) {
        nums1[i] = nums2[j];
    }
    //sort the array to make sure everything is back in order
    nums1.sort((a, b) => a - b);
};