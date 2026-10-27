class Solution {
    public String[] createGrid(int m, int n) {
        //create a 2d array to make creaking the grid easier
        char[][] grid = new char[m][n];
        

        //fill all the rows with # to show that they can't be crossed
        for (char[] row : grid){
            Arrays.fill(row, '#');
        }
            
        //creaate the start point 
        int r = 0, c = 0;
        grid[r][c] = '.';
        

        //find where to put the path
        while (r < m - 1 || c < n - 1) {
            if (r < m - 1 && (c == n - 1 || Math.abs((r + 1) * (n - 1) - c * (m - 1)) <= Math.abs(r * (n - 1) - (c + 1) * (m - 1)))){
                r++;
            }
            else{
                c++;
            }
            grid[r][c] = '.';
        }
        
        //create the string for the submission
        String[] res = new String[m];
        

        //convert into the string
        for (int i = 0; i < m; i++){
            res[i] = new String(grid[i]);
        }
            
        return res;
    }
}