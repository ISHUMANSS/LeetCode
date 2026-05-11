class Solution {
    public int[] separateDigits(int[] nums) {
        //seprate each number into a string
        //get each character and put them into the array

        //create an array list to make adding things easier
        List<Integer> list = new ArrayList<>();

        //loop through all the numbers
        for(int x : nums){
            //loop through all the characters of each number
            //convert each number into a string with the value of the number
            //then convert that string into a char array to be able to access everything independtly
            for(char c : String.valueOf(x).toCharArray()){
                //add to the list
                list.add(c - '0'); //convert to int from character
            }

        }

        //create an array with the length of the array list
        int[] result = new int[list.size()];
        //put all the seprate numbers into the list
        for(int i = 0; i < result.length; i++){
            result[i] = list.get(i);
        }
        
        return result;

    }
}