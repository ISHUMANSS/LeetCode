/**
 * @param {string} s
 * @return {string}
 */
var makeFancyString = function(s) {

    //want to be able to do this in a single path to get O(n) at worst


    //I get a time Time Limit Exceeded when i try to submit and pass 305/306 testcases
    //create what will be the fancy string
    //To fix time out I'm gonna use an array rather then a string 
    let result = [];
    

    for(let i = 0; i < s.length; i++){
        let n = result.length;

        //check last 2 characters in result if it matchs the letter from the string
        if (n < 2 || !(result[n - 1] === s[i] && result[n - 2] === s[i])) {
            //push to the array 
            result.push(s[i]);
        }        
        
    }
    
    //re join the array 
    return result.join('');
};