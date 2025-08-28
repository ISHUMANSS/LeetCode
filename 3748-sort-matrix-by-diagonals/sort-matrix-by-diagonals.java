import java.util.*;
class Solution {
    public int[][] sortMatrix(int[][] grid) {
        // Map to store diagonals, where key is the difference of row and column index
        Map<Integer, List<Integer>> diagonalMap = new HashMap<>();
        int rows = grid.length, cols = grid[0].length;

        // Traverse the matrix and group elements by their diagonal (row - col)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int key = i - j;
                diagonalMap.putIfAbsent(key, new ArrayList<>());
                diagonalMap.get(key).add(grid[i][j]);
            }
        }

        // Sort each diagonal: negative keys (upper diagonals) in ascending order,
        // positive keys (lower diagonals) in descending order
        for (Map.Entry<Integer, List<Integer>> entry : diagonalMap.entrySet()) {
            List<Integer> values = entry.getValue();
            if (entry.getKey() < 0) {
                Collections.sort(values);
            } else {
                values.sort(Collections.reverseOrder());
            }
        }

        // Populate the sorted values back into the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int key = i - j;
                grid[i][j] = diagonalMap.get(key).remove(0);
            }
        }

        return grid;
    }
}