class Solution {
    public String convertToBase7(int num) {
        //base case
        if(num == 0){
            return "0";
        }

        StringBuilder res = new StringBuilder(); 

        int n = Math.abs(num);

        while (n > 0){
            res.append(n % 7);
            n = n / 7; 
        }

        //add the negitive sign
        if(num < 0){
            res.append("-");
        }


        return res.reverse().toString();
        
    }
}