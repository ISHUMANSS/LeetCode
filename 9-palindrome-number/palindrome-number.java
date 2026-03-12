class Solution {
    public boolean isPalindrome(int x) {
        boolean result = false;

        StringBuilder pal = new StringBuilder();

        StringBuilder rev = new StringBuilder();

        pal.append(x);

        rev.append(x);
        rev.reverse();

        if(pal.toString().equals(rev.toString())){
            result = true;
        }

       

        return result;


    }
}