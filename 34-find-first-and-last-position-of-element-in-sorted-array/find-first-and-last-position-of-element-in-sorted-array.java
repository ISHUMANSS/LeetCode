class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = {-1, -1};

        //quick exit array is to small
        if(arr.length == 0){
            return arr;
        }
        //run binary search and then use two pointers to find the outer edeges
        int res = binarySearch(nums, 0, nums.length - 1, target);

        //not found
        if(res == -1){
            return arr;
        }

        //use two pointer from the index to be able to find the outer bounds
        int left = res;
        int right = res;
        
        //loop through to find the outer bounds of the target number
        //expand left
        while (left - 1 >= 0 && nums[left - 1] == target) {
            left--;
        }

        //expand right
        while (right + 1 < nums.length && nums[right + 1] == target) {
            right++;
        }

        arr[0] = left;
        arr[1] = right;

        return arr;
    }

    static int binarySearch(int a[], int l, int r, int x){
      	if (r >= l) {
            int m = l + (r - l) / 2;

            // Returned Index of the Element
            if (a[m] == x)
                return m;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (a[m] > x)
                return binarySearch(a, l, m - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(a, m + 1, r, x);
        }

        // No Element Found
        return -1;
    }
}