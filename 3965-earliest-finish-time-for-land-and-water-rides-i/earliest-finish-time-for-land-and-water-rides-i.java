class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {

        //any min will be smaller
        int ans = Integer.MAX_VALUE;

        //check if the finish time for both pairs to find the lowest values

        for(int i = 0; i < landStartTime.length; i++){
            for(int j = 0; j < waterStartTime.length; j++){
                //check going from land to water
                int landFin = landStartTime[i] + landDuration[i];
                int waterStart = Math.max(landFin, waterStartTime[j]); //start water after the land has finished
                int fin1 = waterStart + waterDuration[j];

                //check going from water to land
                int waterFin = waterStartTime[j] + waterDuration[j];
                int landStart = Math.max(waterFin, landStartTime[i]);
                int fin2 = landStart + landDuration[i];

                //get the lower finish time and check it against the current lowest
                ans = Math.min(ans, Math.min(fin1, fin2));


                //gets check for each pair
            }
        }



        return ans;
        
    }
}