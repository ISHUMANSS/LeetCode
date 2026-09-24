class Solution {
    public int smallestIndex(int[] nums) {
        //break up the numers at each index to get their sum 
        //if the sum ever matches return that as it will be the lowest

        for(int i = 0; i < nums.length; i++){
            //check if both indexs match
            //get the characters
            String numberStr = String.valueOf(nums[i]);
            int sum = 0;

            //seprate the string into characters
            for (int j = 0; j < numberStr.length(); j++) {
                char ch = numberStr.charAt(j);
                int digit = Character.getNumericValue(ch);
                System.out.println("Digit: " + digit);
                sum = sum + digit;
            }

            //check if the sum matches the index
            if(i == sum){
                return i;
            }

        }

        return -1;
    }
}