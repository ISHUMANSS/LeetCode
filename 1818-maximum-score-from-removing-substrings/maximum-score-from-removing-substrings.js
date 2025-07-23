/**
 * @param {string} s
 * @param {number} x
 * @param {number} y
 * @return {number}
 */
var maximumGain = function(s, x, y) {

    //ways to gain points
    //remove substring ab from string s and gain x points where x is a number that is given
    //remove substring ba from string s and gain y points where y is a number that is given


    //retrun the max number of points you can get after doing the operations

    //if we can get the higher number of points we should use that rather then the lower to get a better max


    //can use a stack by adding everything to the stack
    //reomve all of the substring that give the higher number of points in one pass
    //remove all the substrings that give the lower amout of points
    let result = 0;

    //set what character are worth more
    let top, bot;

    //set the scores for when you remove the substrings
    let top_score, bot_score;

    //check what is worth more
    if(x > y){
        top = "ab";
        top_score = x;
        bot = "ba";
        bot_score = y;
    }
    else{
        top = "ba";
        top_score = y;
        bot = "ab";
        bot_score = x;
    }

    //now we can remove the substring that will give us the most points
    //remove the top scoring substrings
    let stack = [];
    for(let char of s){
        //check if the there are substrings that match the top
        if(char == top[1] && stack.length > 0 && stack[stack.length - 1] == top[0]){
            result += top_score;
            stack.pop();
        }
        else{
            stack.push(char);
        }
    }

    //removing the bottom scoring substrings
    let new_stack = [];
    for(let char of stack){
        if (char == bot[1] && new_stack.length > 0 && new_stack[new_stack.length - 1] == bot[0]) {
            result += bot_score;
            new_stack.pop();
        } 
        else {
            new_stack.push(char);
        }
    }
    
    return result

    
};