/**
 * @param {number[]} players
 * @param {number[]} trainers
 * @return {number}
 */
var matchPlayersAndTrainers = function(players, trainers) {
    //sort the players and the trainers into new arrays
    //we want to sort them becasue it makes the comparisons easier 
    players = new Int32Array(players).sort();
    trainers = new Int32Array(trainers).sort();

    let p = 0;
    let t = 0;
    //only loop around once so it should be O(n)
    while(p < players.length && t < trainers.length){
        //check to see if they match 
        if (players[p] <= trainers[t]){
            p ++;
        }
        t ++;
    }

    return p;



    /*
    //O(n^2) so like not great but this is what I came up with by myself

    //sort the trainers and the players to make finding the options easier
    players.sort((a,b) => a-b);
    trainers.sort((a,b) => a-b);

    let max = 0;

    //loop through the players and loop through loop through the trainers
    for(let i = 0; i < players.length; i++){
        for(let j = 0; j < trainers.length; j++){
            if(players[i] <= trainers[j]){
                trainers.shift();
                max++;
                break;//move to the next player
            }
            else {
                //remove the trainers that are to small
                trainers.shift(); 
                j--;
            }
        }
    }
    

    return max;   
    */
};