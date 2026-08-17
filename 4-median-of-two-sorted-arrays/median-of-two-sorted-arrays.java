class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //two pointers one in each array get the length of both the arrays and find the element that is at the center

       
        int len = nums1.length, n = nums2.length;
        int total = len + n;
        int midIndex1 = (total - 1) / 2;  
        int midIndex2 = total / 2; 

        int i = 0, j = 0, count = 0;
        int mid1 = 0, mid2 = 0;
        while (count <= midIndex2) {
            int val;
            if (i < len && (j >= n || nums1[i] <= nums2[j])) {
                val = nums1[i++];
            } else {
                val = nums2[j++];
            }
            if (count == midIndex1) mid1 = val;
            if (count == midIndex2) mid2 = val;
            count++;
        }


        //when the both arrays len is even need to do more
        return (total % 2 == 0) ? (mid1 + mid2) / 2.0 : mid2;

      
    }

}