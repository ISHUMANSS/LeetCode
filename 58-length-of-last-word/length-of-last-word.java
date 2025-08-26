class Solution {
    public int lengthOfLastWord(String s) {
        
        //trim so we can get rid of the extra white space

        //get the last index of " "
        //return the length of the trimed string - the last index -1

        String stimmed = s.trim();

        int lastIndex = stimmed.lastIndexOf(" ");
        
        int len = stimmed.length() - lastIndex -1;
        
        return len;

    }
}