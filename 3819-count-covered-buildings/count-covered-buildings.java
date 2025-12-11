class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {


        //find if a building has adjectent building on all sides

        //prob like only boyher with ones that are more in the middle casuse the ones on the edge can never be covered

        //each building has an x and y cord
        //so to be covered there must be at least + and - 1 on each side


        //find the most extrem building for each cord


        //create the array for the max of each row and foloum
        int[] fr = new int[n+1];
        int[] lr = new int[n+1];
        int[] fc = new int[n+1];
        int[] lc = new int[n+1];

        //set all the entries to be not in the city to make finding the max and min pints easier
        Arrays.fill(fr,-1);
        Arrays.fill(lr,-1);
        Arrays.fill(fc,-1);
        Arrays.fill(lc,-1);

        //find the most extreme parts of each row
        for(int[] a : buildings){
            int r = a[0];
            int c = a[1];
            fc[c] = (fc[c]==-1) ? r : Math.min(r,fc[c]);
            lc[c] = (lc[c]==-1) ? r : Math.max(r,lc[c]);
            fr[r] = (fr[r]==-1) ? c : Math.min(c,fr[r]);
            lr[r] = (lr[r]==-1) ? c : Math.max(c,lr[r]);
        }


        //check if a building is inbetween things on its row
        int count = 0 ;
        
        for(int[] a : buildings){
            int r = a[0];
            int c = a[1];
            if(fc[c]!=r && lc[c]!=r && fr[r]!=c && lr[r]!=c) {
                count++;
            }
        }
        return count;


        
        
    }
}