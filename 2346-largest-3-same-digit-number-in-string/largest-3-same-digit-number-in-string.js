/**
 * @param {string} num
 * @return {string}
 */
var largestGoodInteger = function(num) {

    //have to find the highest 3 number sub string

    //check there are more them 3
    if(num.length < 3){
        return "";
    }

    //loop through once and find the highest thing number that relases 3 times
    let best = "";
    
    

    for (let i = 0; i <= num.length - 3; i++) {
        let sub = num.substring(i, i + 3);
        if (sub[0] === sub[1] && sub[1] === sub[2]) {
            if (best === "" || sub > best) {
                best = sub;
            }
        }
    }


    return best;

    
};