/**
 * @param {number} eventTime
 * @param {number[]} startTime
 * @param {number[]} endTime
 * @return {number}
 */
var maxFreeTime = function(eventTime, startTime, endTime) {
    //eventTime a number for how long the whole day goes i think
    //startTime an array of numbers saying when events start
    //endTime an array of numbers saying when events end

    //the corresponding digits are connected so start[n] and end[n] are for the same meeting and says how long the meeting will go on for

    //wants us to return the max amout of free time possible after moving arounds the meetings

    //notes:
    //only can re sechdual at MOST one meeting
    //meeting can't be reschedualed to a time outside the event and shouldn't overlap
    //it is ok for the order of meetings to change so the first meeting doesn't NEED to be done first

    //hints
    //if we reschedule a meeting earlier or later we need to find a gap with the lenght of time at lest endTime[i] - startTime[i] 
    //try to maintatin the gams in some sorted data structure


    //code
    const n = startTime.length;

    //find the max before the first meeting
   let maxBeforeFirst = startTime[0];

    
    //find the max after the final meeting
    let maxAfterLast = eventTime - endTime[endTime.length-1];


    //find the current free time
    //use the free time we currently have with the before and after we also need to find the space in between
    
    let maxFree = Math.max(
        //if the length of the start time is more then one then add do (startTime[1] - endTime[0]) else 0
        maxBeforeFirst + (n > 1 ? startTime[1] - endTime[0] : 0), 
        maxAfterLast + (n > 1 ? startTime[n-1] - endTime[n-2] : 0)

        //this is the current max gap if the meeting are next to each other
    );

    //track the current games
    let maxGapBefore = maxBeforeFirst;
    let maxGapAfter = maxAfterLast;

    //go through and check the gaps and if it would be better if you shifted the meetings
    for(let i = 1; i < n; i++){

        //set up mirror index so its able to count backwards
        //allows you to check from the frount and the end
        const k = n - 1 - i;

        //calculate potential free time by moving the current meeting
        //used for meeting in the first half of the array
        const nextStart = (i < n - 1) ? startTime[i + 1] : eventTime;
        const currentDuration = endTime[i] - startTime[i];
        const potentialFree = nextStart - endTime[i - 1] - (currentDuration <= maxGapBefore ? 0 : currentDuration);
        maxFree = Math.max(maxFree, potentialFree);

        //for meeting in the second half of the array
        const prevEnd = (k > 0) ? endTime[k - 1] : 0;
        const currentDurationK = endTime[k] - startTime[k];
        const potentialFreeK = startTime[k + 1] - prevEnd - (currentDurationK <= maxGapAfter ? 0 : currentDurationK);
        maxFree = Math.max(maxFree, potentialFreeK);
       

        //update the max gaps
        maxGapBefore = Math.max(maxGapBefore, startTime[i] - endTime[i - 1]);
        maxGapAfter = Math.max(maxGapAfter, (k < n - 1 ? startTime[k + 1] - endTime[k] : 0));
    }


    //return the max free time
    return maxFree;




    
};