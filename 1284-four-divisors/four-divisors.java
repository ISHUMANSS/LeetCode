import java.util.ArrayList;
import java.util.List;

class Solution {
    public int sumFourDivisors(int[] nums) {

        // store divisors for each number
        List<List<Integer>> all_divisors = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            // FIX 1: pass the number, not the index
            ArrayList<Integer> divs = getDivisors(nums[i]);

            // only keep numbers that have exactly 4 divisors
            if (divs.size() == 4) {
                all_divisors.add(divs);
            }
        }

        int sum = 0;

        // FIX 2: correctly sum the divisors
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

        // FIX 3: find ACTUAL divisors (not prime factors)
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

                // FIX 4: stop early if more than 4 divisors
                if (count > 4) {
                    return new ArrayList<>();
                }
            }
        }

        return divisors;
    }
}
