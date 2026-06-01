class Solution {
    public int minimumCost(int[] cost) {
        //need to find the best paris which will decrease the cost as much as possible
       
        //sort
        Arrays.sort(cost);

        int total = 0;

        
        for (int i = cost.length - 1; i >= 0; i -= 3) {
            total += cost[i];
            if (i - 1 >= 0){
                total += cost[i - 1];
            }
        }

        return total;


    }
}