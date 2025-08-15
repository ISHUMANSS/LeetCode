class Solution {
    public boolean isPowerOfFour(int n) {
        //need to check if somthing is a power of 4
        //try to do it without nay loops or recursion

        //check its not a negative number
        //check if its a power of (2^2)^2
        //check if mod 3 = 1 casue if we device a power of 4 by 3 we should get 1
        return (n & (n - 1)) == 0 && n % 3 == 1;


    }
}