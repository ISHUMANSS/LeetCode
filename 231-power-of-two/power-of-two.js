/**
 * @param {number} n
 * @return {boolean}
 */
var isPowerOfTwo = function(n) {
    //base case
    if (n === 1) { return true }
    else if (n < 1 || n % 2 !== 0) { return false }

    return isPowerOfTwo(n / 2)

};