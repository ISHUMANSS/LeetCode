import java.io.*;

class Solution {
    public String convertToTitle(int columnNumber) {
        //try with mod 26 to get the number?
        //i'd have to get the first digit first tho
        //could like -26 a bunch of times?

        StringBuilder result = new StringBuilder();

        while(columnNumber > 0){
            columnNumber --;

            //find what char it matches to
            int remain = columnNumber % 26;

            //find the character it matches to and add that to the list
            result.append((char) (remain + 'A'));

            //move over to the next column
            columnNumber /= 26;
        }

        
        //put the characters in the right order
        return result.reverse().toString();

    }
}