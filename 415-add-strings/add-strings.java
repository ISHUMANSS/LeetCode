class Solution {
    public String addStrings(String num1, String num2) {
        //easyist way would just be to convert to an int but we are not allowed


        //think about it as adding digits on paper one digit at a time

        //create a string builder as they are easier to deal with
        StringBuilder ans = new StringBuilder();

        //create 2 pointers to the end of both of the numbers
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        //carry is the left over form the addition between the 2 numbers
        int carry = 0;
        int sum = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? num1.charAt(i--) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j--) - '0' : 0;

            sum = digit1 + digit2 + carry;
            ans.append(sum % 10);
            carry = sum / 10;
        }


        //we have to convert back to string and reveres it as we were dealing with it backwards
        return ans.reverse().toString();
        
    }
}