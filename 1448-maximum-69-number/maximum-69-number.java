class Solution {
    public int maximum69Number (int num) {
        //convert to char array
        char[] s = String.valueOf(num).toCharArray();

        //do the changes
        for (int i = 0; i < s.length; i++) {
            if (s[i] == '6') {
                s[i] = '9';
                break;
            }
        }

        //convert back to int
        return Integer.parseInt(new String(s));

    }
}