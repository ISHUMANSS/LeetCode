/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {

    //one way to do this is with a stack as you can push all the numbers in and then pop them all out and get the number to be reversed

    //last in first out

    var str = x.toString();
    var stack = [];
    var reverse = "";
    for(let i = 0; i < str.length; i++){
        stack.push(str.charAt(i));
    }
    for(let i = 0; i < str.length; i++){
        reverse = reverse +stack.pop(i);
    }

    if(reverse == str){
        return true;
    }


    

    return false;
};