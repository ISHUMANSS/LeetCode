class Solution {
    public int maxProfit(int[] prices) {
        //just need to find the min and the max

        //keep track of the lowest value we have seen
        int min = Integer.MAX_VALUE;

        //set up profits so we can tell if when the best time to sell is
        int proftoday = 0;
        int profit = 0; 

        for(int i = 0; i < prices.length; i++){
            //reset the min
            if(prices[i] < min){
                min = prices[i];
            }

            //find what we could get if we sold today
            proftoday = prices[i] - min;
            
            //check if the profit is better if so switch them
            if(profit < proftoday){
                profit = proftoday;
            }

        }


        return profit;

    }
}