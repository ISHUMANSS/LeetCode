class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        
        //sort the array first
        Arrays.sort(asteroids);

        long currentMass = mass;

        //see if we can go through all the asteroids
        for(int astroid : asteroids ){
            if(currentMass < astroid){
                return false;
            }
            currentMass += astroid;
        }

        return true;

    }
}