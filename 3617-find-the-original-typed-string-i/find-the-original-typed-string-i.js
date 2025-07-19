/**
 * @param {string} word
 * @return {number}
 */
var possibleStringCount = function(word) {
    
    //find which chracters appare more then once consecutively
    let n = word.length;

    //assume the max count is when all the letters at the same
    let count = n;
    for(let i = 1; i < n; i++){
        //if the letters don't match the count of consecutively goes down
        if(word[i] !== word[i - 1]){
            count --;
        }

    }

    return count;

};