/**
 * @param {string} word1
 * @param {string} word2
 * @return {number}
 */
var minDistance = function(word1, word2) {

    // graph problem we can use dynamic programming to do this

    // we need to find how many operations it will take to be able to get from one word to another

    // what we are allowed to do:
    /*
    insert a new character
    delete a character
    replace a character
    */
    
    // if the words match
    if (word1 === word2) {
        return 0;
    }

    // set up the 2d array
    let m = word1.length;
    let n = word2.length;

    // set up the base cases
    // these will occur when one of the words is empty and it will take the length of the other word to be able to change it
    if (n === 0) return m;
    if (m === 0) return n;

    const arr = Array.from({ length: m + 1 }, () =>
        Array(n + 1).fill(0)
    );

    // create the base cases
    for (let i = 0; i <= m; i++) {
        arr[i][0] = i;
    }
    for (let j = 0; j <= n; j++) {
        arr[0][j] = j;
    }

    // fill the table
    for (let i = 1; i <= m; i++) {
        for (let j = 1; j <= n; j++) {
            //
            if (word1[i - 1] === word2[j - 1]) {
                arr[i][j] = arr[i - 1][j - 1];
            } else {
                arr[i][j] = Math.min(
                    arr[i - 1][j] + 1,     // delete
                    arr[i][j - 1] + 1,     // insert
                    arr[i - 1][j - 1] + 1  // replace
                );
            }
        }
    }

    return arr[m][n];
};
