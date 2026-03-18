import java.util.Arrays;

class Solution {
    public int countSubmatrices(int[][] v, int k) {
        int n = v.length, m = v[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m; j++) {
                v[i][j] += v[i][j - 1];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                v[j][i] += v[j - 1][i];
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (v[i][j] <= k) {
                    ans++;
                }
            }
        }

        return ans;
    }
}
