class Solution {
    public int myAtoi(String s) {
        
        //get rid of while space
        s = s.trim();

        //if its empty return
        if(s.isEmpty()){
            return 0;
        }

        //get the sign

        int index = 0;
        int sign = 1;
        if(s.charAt(0) == '+'){
            index ++;
        }
        else if(s.charAt(0) == '-'){
            sign = -1;
            index ++;
        }


        long result = 0; //use long to detect overflow
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';
            result = result * 10 + digit;

            //check for overflow
            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            index++;
        }

        //return final result
        //make it postive or negative based on the signs
        return (int) (result * sign);


    }
}