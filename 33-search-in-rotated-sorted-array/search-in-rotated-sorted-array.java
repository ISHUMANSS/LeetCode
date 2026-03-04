class Solution {
    public int search(int[] nums, int target) {
        //array is sorted but the center point is no longer in the middle
        //this means that you can't just use quick sort
        //if we were allowed to have a way longer time complexity we could resort it and then search 
        //or you could just seach and get o(n)


        //we need to find how far the array has been shifted over
        //use two pointer one at the start and at the end
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            //check to see if we have the element
            if (nums[mid] == target){
                return mid;
            }

            //check if the left half is sorted
            if(nums[mid] >= nums[start]){
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1; //move left
                } else {
                    start = mid + 1; //move right
                }
            }
            //check to see if the right half is sorted
            else{
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1; //move right
                } else {
                    end = mid - 1; //move left
                }
            }
        }
        //not found
        return -1;

    }
}