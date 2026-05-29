class Solution {
    public int minElement(int[] nums) {
        //seprate all the numbers into its single integers
        //then sort the array and return min
        int result = 0;

        for(int i = 0; i < nums.length; i++){
            //convert the int to a string
            String s = String.valueOf(nums[i]);

            //sum the values togther
            char[] chars = s.toCharArray();
            int sum = 0;
            
            for(int j = 0; j < chars.length; j++){
                sum = sum + Character.getNumericValue(chars[j]);
            }
            nums[i] = sum;
            System.out.println(nums[i]);
            
        }

        Arrays.sort(nums);


        return nums[0];
        
    }
}