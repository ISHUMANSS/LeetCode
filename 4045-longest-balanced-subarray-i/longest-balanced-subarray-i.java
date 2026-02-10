import java.util.Set;
import java.util.HashSet;

class Solution {
    public int longestBalanced(int[] nums) {
        //Idea:
        //keep 2 seprate sets one for evens and one for odds
        //this will allow us to keep track of the number of even numbers and the number of odd numbers
        //need to be able to check all of the sets so like need to loop through twice

        

        //total length of the distinct elements
        // int length = Integer.MIN_VALUE;;

        // for(int i = 0; i < nums.length; i ++){
        //     //create the sets to keep distinct all the numbers in
        //     Set<Integer> evens = new HashSet<>();
        //     Set<Integer> odds = new HashSet<>();
        //     for(int j = i; j < nums.length; j++){
        //         //check if the number is even
        //         if(nums[j] % 2 == 0){
        //             //add to the even set
        //             evens.add(nums[j]);
        //         }
        //         else{
        //             odds.add(nums[j]);
        //         }
        //         //check if the lengths of the sets are the same
        //         if(evens.size() == odds.size()){
        //             length = Math.max(length,j-i+1);
        //         }
        //     }
        //     //there are no evens or odds
        //     if(length == Integer.MIN_VALUE){
        //         return 0;
        //     }
            

        // }

        // return length;
        

        int maxlen=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> set1=new HashSet<>();
            HashSet<Integer> set2=new HashSet<>();
            for(int j=i;j<nums.length;j++){
                if(nums[j]%2==0){
                   set1.add(nums[j]);
                }
                else{
                    set2.add(nums[j]);
                }
                if(set1.size()==set2.size()){
                    maxlen=Math.max(maxlen,j-i+1);
                }
            }
        }
        if(maxlen==Integer.MIN_VALUE){
            return 0;
        }
        return maxlen;
    }
}