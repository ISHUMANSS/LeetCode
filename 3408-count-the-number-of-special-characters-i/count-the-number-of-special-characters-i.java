import java.util.HashSet;
class Solution {
    public int numberOfSpecialChars(String word) {
        //casue theres only 52 options we can use like bucket sort

        //convert to a char array so its easier to get to the individual elements
        //char[] arr = word.toCharArray();

        //brute force it so it adds everything to a hash set
        //checks if each element also contains the toUpperCase()
        HashSet<Character> charcters = new HashSet<Character>();
        for(char c : word.toCharArray()){
            charcters.add(c);
        }

        int count = 0;
        for(char c : charcters){
            //check if the set contains the upper case
            //make sure its not the higher one
            if(Character.isLowerCase(c) && charcters.contains(Character.toUpperCase(c)) ){
                count++;
            }
        }


        return count;


        
    }
}