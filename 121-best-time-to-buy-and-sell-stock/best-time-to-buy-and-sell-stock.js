/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    
    //two pointer?

    //find cheapest price to buy
    //find best price to be able to sell

    //need to make sure that the cheapest price is done before the most expensive price so it is possible to buy and then sell

    

    let left = 0;//buy
    let right = 1;//sell
    let max_profit = 0;

    //loop through the list
    while (right < prices.length) {
            
            if (prices[left] < prices[right]) {
                let profit = prices[right] - prices[left];
                max_profit = Math.max(max_profit, profit);
            } 
            else {
                left = right;
            }
        right++;
    }
    return max_profit;


};