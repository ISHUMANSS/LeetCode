class Solution {
    public int majorityElement(int[] nums) {
        
        //we want to just check the list one to find the element which repeats the most times 
     

        //sort the list
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];

    }
}