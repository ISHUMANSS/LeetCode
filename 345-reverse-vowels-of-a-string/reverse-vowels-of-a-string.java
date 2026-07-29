class Solution {
    public String reverseVowels(String s) {

        //one pointer at the end of the string
        //one pointer at the start of the string
        //stop when they meet
        //when a pointer reaches a vowl wait until the other one reaches
        //when both are on a vowl switch the positions and move the pointer again

        String vowels = "aeiouAEIOU";

        int p1 = 0;
        int p2 = s.length() -1;

        char[] word = s.toCharArray();

        while(p1 < p2){
            //find the first vowel
            while (p1 < p2 && vowels.indexOf(word[p1]) == -1) {
                p1++;
            }

            //find the second vowel
            while (p1 < p2 && vowels.indexOf(word[p2]) == -1) {
                p2--;
            }

            //switch
            char temp = word[p1];
            word[p1] = word[p2];
            word[p2] = temp;
            
            //increase the pointers
            p1++;
            p2--;

        }

        String answer = new String(word);
        return answer;
    }
}