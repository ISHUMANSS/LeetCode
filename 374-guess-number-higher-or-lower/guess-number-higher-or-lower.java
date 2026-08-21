/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        //binary search
        int left = 1;
        int right = n;

        while (left <= right){
            int mid = left + (right - left) / 2;
            //int result = guess(mid);

            //check to see if higher or lower or the answer
            if(guess(mid) == 0){
                return mid;
            }
            //lower
            else if(guess(mid) == -1){
                right = mid - 1;
            }
            //higher
            else if(guess(mid) == 1){
                left = mid + 1;
            }

        }

        return -1;

    }
}