/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    if(strs.length === 0) return "";//there will be no common prefix
    //set the first string as the prefix
    let prefix = strs[0];
    //loop through all the options
    for(let i = 0; i < strs.length; i++){
        //check to see if the prefix is in the string
        while(strs[i].indexOf(prefix) !== 0){
            //check to see if any of the prefix match
            prefix = prefix.slice(0, -1);
            //if they don't match slice out the prefix by one and go down by one
            if(!prefix) return "";
        }
    }
    return prefix;
    

    
};