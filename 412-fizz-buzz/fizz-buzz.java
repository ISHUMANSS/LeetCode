class Solution {
    public List<String> fizzBuzz(int n) {

        List<String> words = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            if(i % 5 == 0 && i % 3 == 0){
                words.add("FizzBuzz");
            }
            else if(i % 5 == 0){
                words.add("Buzz");
            }
            else if(i % 3 == 0){
                words.add("Fizz");
            }
            else{
                words.add(String.valueOf(i));
            }
        }

        return words;
        
    }
}