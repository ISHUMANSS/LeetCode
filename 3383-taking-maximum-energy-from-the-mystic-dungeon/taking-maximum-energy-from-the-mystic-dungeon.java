class Solution {
    public int maximumEnergy(int[] energy, int k) {
        //trying to find the max when reaching the end
        int len = energy.length;

        int arr[] = new int[len];
        int max = Integer.MIN_VALUE;

        for(int i = len - 1; i >= 0; i--){
            if(i + k < len){
                arr[i] = energy[i] + arr[i+k];
            }
            else{
                arr[i] = energy[i];
            }
            max = Math.max(max,arr[i]);
        }

        return max;
    }
}