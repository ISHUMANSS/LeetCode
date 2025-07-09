/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    
    /*var max = 0;
    
    //could loop through the string breaking it each time there is a space character found
    var arr = s.split(/\s+/).filter(word => word !== '');

    var last = arr[arr.length - 1]
    //get last that 
    max = last.length;

    return max;
    */
    let t = s.trim();//get rid of the spaces that aren't in the middel

    //create substrings of the final word by finding the last space
    //get the length of that substring
    return t.substring(t.lastIndexOf(" ")+1).length;



};