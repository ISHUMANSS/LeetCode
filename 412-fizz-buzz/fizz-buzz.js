/**
 * @param {number} n
 * @return {string[]}
 */
var fizzBuzz = function(n) {
    //fizz buzz when both divisbal by 3 and 5

    //fizz when devisible by 3

    //buzz when divisibal by 5

    let arr = [];

    //go all the way up for the number of times
    for(let i = 1; i < n + 1; i ++){
        if(i % 5 == 0 && i % 3 == 0){
            //check if it is divisible by both so add FizzBuzz
            arr.push("FizzBuzz");
        }
        else if(i % 5 == 0){
            //check if its divisable by 5 so add Buzz
            arr.push("Buzz");
        }
        else if(i % 3 == 0){
            //check if its divisible by 3 so add Fizz
            arr.push("Fizz");
        }
        else{
            //isn't divisibal by either of them so just add the number
            arr.push(String(i));
        }
    }

    return arr;

    
};