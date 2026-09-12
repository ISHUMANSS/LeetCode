class Solution {
    public int longestPalindrome(String s) {
        //keep track of all the letters that has apared if its an even number or 1 it can be a palindrome

        //are case senstive

        //keep track of all the odd numbers
        int oddCount = 0;


        Map<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            if (map.get(ch) % 2 == 1){
                oddCount++;
            }
            else{
                oddCount--;
            }
        }
        if (oddCount > 1){
            return s.length() - oddCount + 1;
        }
        return s.length();

    }
}