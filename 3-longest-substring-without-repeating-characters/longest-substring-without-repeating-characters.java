class Solution {
    public int lengthOfLongestSubstring(String s) {
        //use 2 pointers
        //start both pointers at the start of the array and 

        //use a hash set this will keep track of the seen values and make sure theres only one of it

        //useing a set is ok here casue there are only 26 possible elements which means sets can work ok even if it means constant checking of the set

        int maxLen = 0;

        HashSet<Character> set = new HashSet<>();

        int left = 0;

        for(int right = 0; right<s.length(); right++){
            //look at the current character in the list and check if we have seen it or not
            char current = s.charAt(right);

            //check if the set contains the current character
            //will not run if the set doesn't have the character in it
            while(set.contains(current)){
                //if the character is in the set remove it and move the left pointer over as it means there is a dupe
                set.remove(s.charAt(left));
                left++;

            }

            //if the letter is not in the list add it to the list
            set.add(current);

            //get the current max substring length
            maxLen = Math.max(maxLen,right-left+1); //+1 cause left starts at 0

        }

        return maxLen;

        

    }
}