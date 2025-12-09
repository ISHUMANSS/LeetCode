class Solution {
    public int threeSumClosest(int[] nums, int target) {
        //sum 3 thing toghter to try and get as close as you can to the value
        //use two pointers that help find the best numbers for each number that will get it closest

        //sort the numbers to be able to find the sums faster?
        Arrays.sort(nums);

        //set up a closest value
        //keep the number large but avoid over flows
        int minAbs = Integer.MAX_VALUE / 2;

        int ans = 0;


        for(int i = 0; i < nums.length - 2; i++){
            //set the target
            int newTar = target - (nums[i]);

            //set the pointers
            int left = i + 1;
            int right = nums.length - 1;

            while(left < right){
                //use the two pointers
                int sum = nums [left] + nums[right];

                if(minAbs > Math.abs(newTar - sum)){
                    minAbs = Math.abs(newTar-sum);
                    ans=nums[i]+sum;
                }
                if(sum>newTar){
                    right --;
                }
                else{
                    left++;
                }
            }
        }
        return ans;
        
    }
}