import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<String> generateParenthesis(int n) {

        //given a number generate all the possible combos for closed parentheses for that number

        //example 3: "((()))","(()())","(())()","()(())","()()()"

        //return a String List with all the possible options

        //number is 1 <= n <= 8

        int open = n;
        int close = n;

        List<String> ans = new ArrayList<>();

        String op = "";

        solve(op, open, close, ans);

        return ans;        
        
        
    }

    public void solve(String op, int open, int close, List<String> ans){
        //exit the recursion
        if(open == 0 && close == 0){
            //add the string to the list
            ans.add(op);
            return;
        }

        //when both are the same then open has to go
        if(open == close){
            String op1 = op;
            op1 += '(';
            //decrease the number of open by one
            solve(op1, open-1, close, ans);
        }
        else if(open == 0){
            //have run out of open braces so closed has to be used
            String op1 = op;
            op1 += ')';
            //decrease the number of open by one
            solve(op1, open, close-1, ans);
        }
        else if(close == 0){
            //only choise is to use open bracket 
            String op1 = op;
            op1 += '(';
            solve(op1, open-1, close, ans);
        }
        else{
            String op1 = op;
            String op2 = op;
            op1 += '(';
            op2 += ')';
            solve(op1, open-1, close, ans);
            solve(op2, open, close-1, ans);
        }


    }
}