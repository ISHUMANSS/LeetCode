class Solution {

    /**
     * @param Integer $x
     * @return Boolean
     */
    function isPalindrome($x) {
        //convert to string
        //create a reversed version
        
        $reversed = strrev((string) $x);

        //print($reversed);

        //see if the two thing fully match
        //cast to string
        if((string) $x == $reversed){
            return true;
        }

        return false;

        
    }
}