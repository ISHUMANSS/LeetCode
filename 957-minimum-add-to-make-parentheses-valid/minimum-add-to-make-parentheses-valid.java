class Solution {
    public int minAddToMakeValid(String s) {
        //use 2 pointers
        //works cause it can only be '(' or ')'

        //open how many open brackets there currently are
        int open = 0;

        //how many times we have needed to insert
        int insert = 0;

        for(int i = 0; i < s.length(); i++){
            //
            if(s.charAt(i) == '('){
                open ++;
            }
            //is closed correctly
            else if(open > 0){
                open --;
            }
            //is not closed correctly
            else{
                insert ++;
            }
        }

        //return the number of open parentheses waiting for a closeing one 
        //and the number of open parentheses we needed to insert
        return insert + open;
        
    }
}