class Solution {
    public int smallestRepunitDivByK(int k) {
        //find length of the smallest Postive interger 
        //it needs to be divisable by k and needs to only contain 1 digit
        //the answer returned needs to be with only ones in it 

        //example k = 3
        //output n = 111 (this is the number 111 not in binary)

        //i don't think this will work agaisnt any even number so we can fail them for that
        //filter out all the even numbers
        //also doesn't work when k is divisible by 5
        if(k % 2 == 0 || k % 5 == 0){
            return -1;
        }

        //find smallest possiblle devision that is all ones
        //we need to increase the n by n * 10 + 1
        int n = 1;

        //keeps track of now many digits we have
        int count = 1;

        //loop through untill we find a number which is divisable by k
        while(n % k != 0){
            n = (n * 10 + 1) % k;
            count ++;
        }
        
        return count;
        
    }
}