class Solution {
    public int countPartitions(int[] nums) {
        //split into 2 sub arrays
        //need to make find the number of partitions where the difference between them is even
        //make sure the array has the same number of odd and even numbers
        int odds = 0;

        for(int i = 0; i < nums.length; i++){
            //check its odd
            if(nums[i] % 2 != 0){
                odds ++;
            }

        }

        if(odds % 2 != 0){
            return 0;
        }

        return nums.length - 1;



    }
}