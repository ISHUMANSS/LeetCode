class Solution {
    public int findClosest(int x, int y, int z) {
        //both person 1 and 2 are trying to move to person 3 on a number line
        //they both move at the same speed
        //you are trying to find the space between the numbers and find who has to take the least steps to get to point 3
        //person 3 isn't always the highest number


        //x is person 1
        //y is person 2
        //z is person 3 (doesn't move)
        
        //find the abslout diffrences
        int d1 = Math.abs(x - z);
        int d2 = Math.abs(y - z);

        //check which one is best        
        if(d1 < d2){
            return 1;
        }
        else if(d2 < d1){
            return 2;
        }
        else{
            return 0;
        }


    }
}