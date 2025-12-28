class Solution {
    public int countNegatives(int[][] grid) {

        //basic just brute force through
        //O(n^2)

        int negcount = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] < 0){
                    negcount ++;
                }
            }
        }
        
        return negcount;
    }
}