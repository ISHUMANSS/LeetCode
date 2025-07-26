/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {
    
    //need to also be able to handle the edge cases where I is just before the symbole

    let value = 0;

    for(let i = 0; i < s.length; i++){
        if(s.charAt(i) === 'I'){
            //after checking the value for I we should check for the edge cases
            if(s.charAt(i + 1) === 'V'){
                value += 4;
                //go up an extra value to skip the next value
                i++;
            }
            else if(s.charAt(i + 1) === 'X'){
                value += 9;
                //go up an extra value to skip the next value
                i++;
            }
            else{
                
            value += 1;
            }
        }
        else if(s.charAt(i) === 'V'){
            value += 5;
        }
        else if(s.charAt(i) === 'X'){
            //handle x edge cases
            if(s.charAt(i + 1) === 'L'){
                value += 40;
                //go up an extra value to skip the next value
                i++;
            }
            else if(s.charAt(i + 1) === 'C'){
                value += 90;
                //go up an extra value to skip the next value
                i++;
            }
            else{
                
            value += 10;
            }
        }
        else if(s.charAt(i) === 'L'){
            value += 50;
        }
        else if(s.charAt(i) === 'C'){
            //handle x edge cases
            if(s.charAt(i + 1) === 'D'){
                value += 400;
                //go up an extra value to skip the next value
                i++;
            }
            else if(s.charAt(i + 1) === 'M'){
                value += 900;
                //go up an extra value to skip the next value
                i++;
            }
            else{
                
            value += 100;
            }
        }
        else if(s.charAt(i) === 'D'){
            value += 500;
        }
        else if(s.charAt(i) === 'M'){
            value += 1000;
        }

    }

    return value;

};