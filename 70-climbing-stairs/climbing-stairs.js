/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function(n) {

    //get the easy case for if its just 1
    if(n <= 1){
        return 1;
    }

    //find how many combos of 1 and 2 steps it would take to reach the top
    let ways = 0;
    let a = 0; 
    let b = 1;

    for(let i = 1; i <= n; i++){
        //use fib to be able to go up and count the number of possible ways
        ways = a + b;
        a = b;
        b = ways;

    }

    return ways;
    


};