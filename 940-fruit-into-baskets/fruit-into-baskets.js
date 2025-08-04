/**
 * @param {number[]} fruits
 * @return {number}
 */
var totalFruit = function(fruits) {
    //i is the type of fruit 
    //we only have 2 baskets 
    //each basket only can hold one one type of fruit
    //we can choose where we want to start picking the fruit
    //have to stop when you get to a thrid unique fruit

    //we need to find the longest subsequrnce of 2 unique values


    //keep what fruits we've seen
    let last = -1;
    let secondLast = -1;
    let lastCount = 0;
    let curr = 0;
    let maxFruits = 0;

    for (let fruit of fruits) {
        if (fruit === last || fruit === secondLast) {
            curr++;
        } else {
            curr = lastCount + 1;
        }

        if (fruit === last) {
            lastCount++;
        } else {
            lastCount = 1;
            secondLast = last;
            last = fruit;
        }

        maxFruits = Math.max(maxFruits, curr);
    }


    return maxFruits;
};