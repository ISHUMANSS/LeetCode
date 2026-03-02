class Solution {

    /**
     * @param String $s
     * @return Integer
     */
    function lengthOfLastWord($s) {

        //seprate the words in the string by the space " "
        //check the length of the last word
        $explodedsentance = explode(' ', trim($s));

        $length = count($explodedsentance);//get the last value

        //get the length of the array
        $finallenght = strlen($explodedsentance[$length -1]);



        return $finallenght;       
    }
}