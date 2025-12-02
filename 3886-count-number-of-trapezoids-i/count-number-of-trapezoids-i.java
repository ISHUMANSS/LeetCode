import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    static int modulo = (int) (1e9 + 7);

    public int countTrapezoids(int[][] points) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for (int[] point : points) {
            int x = point[0], y = point[1];
            map.put(y, map.getOrDefault(y,0)+1);
            set.add(y);
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        long cnt = 0;
        for (int y : list) {
            cnt += find(map.get(y));
        }

        long ans = 0;
        for (int y : list) {
            long get = find(map.get(y));
            cnt -= get;
            ans += (get*cnt)%modulo;
        }

        return (int)(ans%modulo);
    }

    long find(long cnt){
        long ans = cnt*(cnt-1)/2;
        return ans;
    }
}