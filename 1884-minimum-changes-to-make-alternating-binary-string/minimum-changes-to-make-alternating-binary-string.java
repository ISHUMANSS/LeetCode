class Solution {
    public int minOperations(String s) {
        //use XOR
        int count = 0, n = s.length();
        for (int i = 0; i < n; i++){
            count += (s.charAt(i) ^ i) & 1;
        }
          
        return Math.min(count, n - count);




        //this way is able to find a number of times it needs but isn't able to always find the min
        // //use 2 pointers
        // //this is so you can keep track of what the first one is and waht the second one is

        // int operations = 0;

        // //convert to array
        // char[] charArray = s.toCharArray();
        

        // for(int i = 1; i < charArray.length; i++){
        //     int pointer1 = i - 1;
        //     int pointer2 = i;
        //     if(charArray[pointer1] == charArray[pointer2]){
        //         operations ++;

        //     }
        // }

        // return operations;        
    }
}