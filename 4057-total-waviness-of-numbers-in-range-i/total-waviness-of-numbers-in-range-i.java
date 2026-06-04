class Solution {
    public int totalWaviness(int num1, int num2) {
        //insclusive range
        //peak is if its strictrly greater then its immediate numbers
        //a vally if if its less then both of its neighbors
        int waves = 0;

        for(int x = num1; x <= num2; x++){
            //convert to string to all us to check each digit
            String s = String.valueOf(x);

            //loop through each digit
            for (int i = 1; i < s.length() - 1; i++) {
                //check to see if the waves are there
                if ((s.charAt(i) > s.charAt(i - 1) &&
                     s.charAt(i) > s.charAt(i + 1)) ||
                    (s.charAt(i) < s.charAt(i - 1) &&
                     s.charAt(i) < s.charAt(i + 1))) {
                    waves++;
                }
            }


        }

        return waves;

    }
}