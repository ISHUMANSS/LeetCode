class Solution {
    public int minFlips(String s) {
        int one = 0, two = 0, oneFlipped = 0, twoFlipped = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) - '0' == i % 2) {
                one++;
                oneFlipped++;
            } else {
                two++;
                twoFlipped++;
            }
            oneFlipped = Math.min(oneFlipped, two);
            twoFlipped = Math.min(twoFlipped, one);
        }
        if (s.length() % 2 == 0) return Math.min(one, two);
        else return Math.min(Math.min(one, two), Math.min(oneFlipped, twoFlipped));
    }
}