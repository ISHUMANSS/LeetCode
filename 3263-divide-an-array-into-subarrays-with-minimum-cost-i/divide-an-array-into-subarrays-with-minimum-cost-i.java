class Solution {
    public int minimumCost(int[] nums) {

        //devide the array 3 into sub arrays
        //return the output of the total cost (first value form each array)
        //need to make sure that all the numbers are included

        //there will always be at least 3 elements
        //i think the max is 50 for each number
        


        //idea:
        //keep track of the 3 lowest  numbers so we can get the lowest cost
        //the first number will always one of the sub arrays 
        //this means we just need to find the next lowest 2

        int min1 = 51;
        int min2 = 51;

        //loop though the list
        //i needs to be 1 cause we alrady have to use 0
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < min1){
                //swap the numbers
                min2 = min1;
                //set the number to the smaller number
                min1 = nums[i];
            }
            else if(nums[i] < min2){
                min2 = nums[i];
            }
        }




        return nums[0] + min1 + min2;
    }
}