class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        //use two pointer
        int n1 = nums1.length;
        int n2 = nums2.length;

        //keep the indexes for the pointers
        int i = 0, j = 0;

        while(i < n1 && j < n2){
            //check if the min numbers are = escape
            if(nums1[i] == nums2[j]) {
                return nums1[i];
            }
            else if(nums1[i] < nums2[j]) {
                i++;
            }
            else {
                j++;
            }
        }

        return -1;

    }
}