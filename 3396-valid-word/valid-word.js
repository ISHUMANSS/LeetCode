/**
 * @param {string} word
 * @return {boolean}
 */
var isValid = function(word) {
    
    //if the word is shorter then 3 characters
    if(word.length < 3){
        return false;
    }

    //check to see if it only has digits or English letters
    if(!word.match(/^[a-zA-Z0-9]+$/)){
        return false;
    }


    //loop through charcters to check if they are either vowls or constants break if there is at least one of each
    let v = 0, c = 0;
    let vowels = ['a', 'e', 'i', 'o', 'u'];
    //has at least one vowel
    //has at least one constant
    for(let i = 0; i < word.length; i++){
        
        if(v > 1 && c > 1){
            //there is at least one vowel and constant
            break;
        }
        //check it match the vowls
        if(word.charAt(i).toLowerCase().match(/[aeiou]/)){
            v ++;
        }
        //check it matchs the consts
        else if (word.charAt(i).toLowerCase().match(/[a-z]/)){
            c++;
        }
    }


    //check if it has the needed vowls and constants
    return (v > 0 && c > 0);

};