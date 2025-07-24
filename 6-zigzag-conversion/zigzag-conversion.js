/**
 * @param {string} s
 * @param {number} numRows
 * @return {string}
 */
var convert = function(s, numRows) {

    //split up the string into the number number of rows

    //if we were able to create like an array for each row needed then like we could loop through untill the end of the word spliting it up into different arrays
    //if we create a 2d array then like we could use Array.join() to be able to link each section

    //create a quick exit case
    if (numRows === 1) return s;

    //create a 2d array with the number of needed rows
    //each row will contain the characters that fit into that row
    //create the array
    //fill it with empty strings
    //replace the strings with an array maing it 2d
    let boxes = new Array(numRows).fill("").map(() => []);

    //we need to be able to check if what part of the array we are at and if we are still going "down" or now "accoss" in the parten
    let goingDown = false;

    //keep our current place
    let currentRow = 0;


    //loop through all the characters changing each box that it needs to fit in
    for(let char of s){
        //add the character
        boxes[currentRow] += char;

        if(currentRow === 0 || currentRow === numRows - 1){
            //flip if its going down or accross
            goingDown = !goingDown;
        }

        //keep track of the current row and allow it to go and and down
        currentRow += goingDown ? 1 : -1;
    }
    //console.log(boxes);



    return boxes.join("");


    
};