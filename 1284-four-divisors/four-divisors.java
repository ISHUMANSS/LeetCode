import java.util.ArrayList;
import java.util.List;

class Solution {
    public int sumFourDivisors(int[] nums) {

        //find the divisors for each number 
        //only need to go up to 4 divisors so it it passes it then skip and if its less then it don't include it

        //store divisors for each number
        List<List<Integer>> all_divisors = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            ArrayList<Integer> divs = getDivisors(nums[i]);

            //only keep numbers that have exactly 4 divisors
            if (divs.size() == 4) {
                all_divisors.add(divs);
            }
        }

        int sum = 0;

        //sum the divisors
        for (int i = 0; i < all_divisors.size(); i++) {
            for (int j = 0; j < 4; j++) {
                sum += all_divisors.get(i).get(j);
            }
        }

        return sum;
    }

    private ArrayList<Integer> getDivisors(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();
        int count = 0;

        //find divisors
        for (int i = 1; i * i <= n; i++) {

            if (n % i == 0) {
                int d1 = i;
                int d2 = n / i;

                divisors.add(d1);
                count++;

                if (d1 != d2) {
                    divisors.add(d2);
                    count++;
                }

                //stop early if more than 4 divisors
                if (count > 4) {
                    return new ArrayList<>();
                }
            }
        }

        return divisors;
    }
}
