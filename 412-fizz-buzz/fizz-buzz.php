class Solution {

    /**
     * @param Integer $n
     * @return String[]
     */
    function fizzBuzz($n) {

        $answer = array();

        for($i = 1; $i < $n + 1; $i++){
            //number is divisable by both 3 and 5
            //gives FizzBuzz
            if(($i % 3 == 0) && ($i % 5 == 0)){
                $answer[] = "FizzBuzz";//add to the array
            }
            elseif($i % 3 == 0){
                $answer[] = "Fizz";//add to the array
            }
            elseif($i % 5 == 0){
                $answer[] = "Buzz";//add to the array
            }
            else{
                $answer[] = (string) $i;//add to the array
            }

        }
        
        return $answer;

        
    }
}