class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        //given list of rectangles represented by width and length
        //find the biggest diagonal

        
        int max = 0;
        double maxDiagonal = 0.0;

        for (int i = 0; i < dimensions.length; i++) {

            //set up the lengths
            int curr_len = dimensions[i][0];
            int curr_width = dimensions[i][1];

            //get the area
            int curr_max = curr_len * curr_width;

            //get the diagonal length
            double curr_dia_len = Math.sqrt((curr_len * curr_len) + (curr_width * curr_width));

            //update the max if needed
            if (curr_dia_len > maxDiagonal || (curr_dia_len == maxDiagonal && curr_max > max)) {
                maxDiagonal = curr_dia_len;
                max = curr_max;
            }
        }
        return max;
        

    }
}