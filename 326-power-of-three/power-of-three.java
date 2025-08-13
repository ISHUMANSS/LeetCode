class Solution {
    public boolean isPowerOfThree(int n) {
        
        //need to check if somthing is a power of 3
       


        //now we have to check what if the answer is a power of 3
        //we could do this manually checking each power of 3 
        //but that would be slow af


        return n > 0 && 1162261467 % n == 0;

    }
}