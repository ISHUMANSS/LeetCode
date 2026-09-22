import java.util.HashSet;

class Solution {
    public int distributeCandies(int[] candyType) {
        //calculate the number of types of candies there are

        int length = candyType.length;

        int unique = Integer.MIN_VALUE;;

        //find the how many unique ones you can have in your length
        //use a set to keep all of them unique
        HashSet<Integer> candies = new HashSet<>();

        //loop through all the candies to add them to the set
        for(int num : candyType){
            candies.add(num);
        }

        //check the size of the set that is the number of unique elements
        int types = candies.size();


        //pick what is lower between all the types or the length of the array devided by 2

        unique = Math.min(types, length / 2);





        return unique;
        
    }
}