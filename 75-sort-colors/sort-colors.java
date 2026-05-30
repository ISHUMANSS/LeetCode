class Solution {
    public void sortColors(int[] nums) {
        //keeping a count of what the nums are

        int zeros = 0;
        int ones = 0;
        int twos = 0;

        //loop through the array counting each number
        for(int num : nums){
            if(num == 0){
                zeros ++;
            }
            else if(num == 1){
                ones ++;
            }
            else{
                twos ++;
            }
        }

        //update the array with the correct numbers
        for(int i = 0; i < nums.length; i++){
            if(zeros != 0){
                nums[i] = 0;
                zeros --;
            }
            else if(ones != 0){
                nums[i] = 1;
                ones--;
            }
            else{
                nums[i] = 2;
                twos --;
            }
        }

        
    }
}