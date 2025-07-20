/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    //could just fully brute force it with like checking
    //each character agaisnt each other and then keeping a count when the next character is not like the character before

    //need to create some kind of set or map
    const seen = new Map();

    //kep track of the starting index for the current substring
    let start = 0;
    
    //keep track of max length
    let longest = 0;

    for(let i = 0; i < s.length; i++){
        //have we seen the current char
        //if we have move the start 1 + the last index of this char
        if(seen.has(s[i])){
            start = Math.max(seen.get(s[i]) + 1, start);
        }
        seen.set(s[i], i);
        
        //longest = current sub length and the max length
        longest = Math.max(i - start + 1, longest);
    }


    return longest;


};